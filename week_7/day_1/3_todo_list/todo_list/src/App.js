import './App.css';
import React, {useState} from 'react'

function App() {

  const [tasks, setTasks] = useState([
    {name: 'task1', priority: 'low'},
    {name: 'task2', priority: 'high'},
    {name: 'task3', priority: 'low'},
  ]);

  const [newTask, setNewTask] = useState("");
  const [priority, setPriority] = useState("");

  const taskNodes = tasks.map((task, index) => {
    return <li key = {index}>
            <span><b>Name:</b> {task.name} <b>Priority:</b> {task.priority}</span>
          </li>
  });

  const handleTaskInput = (event) => {
    setNewTask(event.target.value);
  }

  const saveNewTask = (event) => {
    event.preventDefault();
    const copyTasks = [...tasks];
    copyTasks.push({name: newTask, priority: priority});
    setTasks(copyTasks)
    setNewTask("")
    setPriority("")

  }

  const handlePrioritySelect = (event) => {
    setPriority(event.target.value)
  }

  




  return (
    <div>
      <h1>Task List</h1>
      <ul>
        {taskNodes}
      </ul>

      <form onSubmit={saveNewTask}>
        <label>Add Task:</label>
        <input type='text' value={newTask} id='new-task' onChange={handleTaskInput}/>
        <input type='submit' value='Save New Task'/>
        <b>Priority:</b>
        <label>Low</label>
        <input type='radio' id='low' name='priority' value='low' onChange={handlePrioritySelect}/>
        <label>High</label>
        <input type='radio' id='high' name='priority' value='high' onChange={handlePrioritySelect}/>
      </form>
      
    </div>
  );
}

export default App;

