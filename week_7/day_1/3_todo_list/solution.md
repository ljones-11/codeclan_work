import './App.css';
import React, {useState} from 'react'

function App() {

  const [tasks, setTasks] = useState([
    {name: 'Buy Shopping', priority: 'low'},
    {name: 'Walk Dog', priority: 'high'},
    {name: "Car's MOT", priority: 'low'},
  ]);

  const [newTask, setNewTask] = useState("");

  const taskNodes = tasks.map((task, index) => {
    return <li key = {index} className={task.priority}>
      <span>
        <b>Name:</b> {task.name} 
        <b> Priority:</b> {task.priority} 
        </span></li>
        
  });

  const handleTaskInput = (event) => {
    setNewTask(event.target.value);
  }

  const saveNewTask = (event) => {
    event.preventDefault();
    const copyTasks = [...tasks];
    copyTasks.push({name: newTask, priority: event.target.priority.value});
    setTasks(copyTasks)
    setNewTask("")

  }




  return (
    <div>
      <h1>ToDo List</h1>
      <hr></hr>

      <ul>
        {taskNodes}
      </ul>
      <form className='form' onSubmit={saveNewTask}>
        <label htmlFor='new-task'>Add New Task</label>
        <input id = 'new-task' type='text' value={newTask} onChange={handleTaskInput}/>
        <input type='submit' value ='Save New Task'/>
        <b>Priority:</b>
        <label>Low</label>
        <input type='radio' id='priority-low' name='priority' value='low'/>
        <label>High</label>
        <input type='radio' id='priority-high' name='priority'  value='high'/>
      </form>
    </div>
  );
}

export default App;
import './App.css';
import React, {useState} from 'react'

function App() {

  const [tasks, setTasks] = useState([
    {name: 'Buy Shopping', priority: 'low'},
    {name: 'Walk Dog', priority: 'high'},
    {name: "Car's MOT", priority: 'low'},
  ]);

  const [newTask, setNewTask] = useState("");

  const taskNodes = tasks.map((task, index) => {
    return <li key = {index} className={task.priority}>
      <span>
        <b>Name:</b> {task.name} 
        <b> Priority:</b> {task.priority} 
        </span></li>
        
  });

  const handleTaskInput = (event) => {
    setNewTask(event.target.value);
  }

  const saveNewTask = (event) => {
    event.preventDefault();
    const copyTasks = [...tasks];
    copyTasks.push({name: newTask, priority: event.target.priority.value});
    setTasks(copyTasks)
    setNewTask("")

  }




  return (
    <div>
      <h1>ToDo List</h1>
      <hr></hr>

      <ul>
        {taskNodes}
      </ul>
      <form className='form' onSubmit={saveNewTask}>
        <label htmlFor='new-task'>Add New Task</label>
        <input id = 'new-task' type='text' value={newTask} onChange={handleTaskInput}/>
        <input type='submit' value ='Save New Task'/>
        <b>Priority:</b>
        <label>Low</label>
        <input type='radio' id='priority-low' name='priority' value='low'/>
        <label>High</label>
        <input type='radio' id='priority-high' name='priority'  value='high'/>
      </form>
    </div>
  );
}

export default App;

