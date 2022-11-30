import pdb 
from models.task import Task
from models.user import User
import repositories.user_repository as user_repository
import repositories.task_repository as task_repository 

user_repository.delete_all()
task_repository.delete_all()

user_1 = User("Deirdre", "Barlow")
user_repository.save(user_1)
user_2 = User("Ken", "Barlow")
user_repository.save(user_2)

task = Task('Walk Dog', user_1, 60)
task_repository.save(task)

found_tasks = user_repository.tasks(user_1)

# task_1 = Task("Go for a run", "Jack Jarvis", 20)
# task_repository.save(task_1)

# task_1.mark_complete()
# task_repository.update(task_1)

# found = task_repository.select(task_1.id)

# # result = task_repository.select_all()

# # for task in result:
# #     print(task.__dict__)

pdb.set_trace()