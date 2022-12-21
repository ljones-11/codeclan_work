import {useState, useEffect} from 'react'
import './App.css';


function App() {
  
  const [number, setNumber] = useState(1);
  const [output, setOutput] = useState("");

  useEffect(() => {
      if (number % 3 === 0 && number % 5 === 0) {
        setOutput("FizzBuzz")
      } else if  (number % 3 === 0) {
        setOutput("Fizz")
      } else if (number % 5 === 0) {
        setOutput("Buzz")
      } else {
        setOutput(number)
      }
    }, [number])
    
  
  const handleInc = () => {
    setNumber(number + 1)
  };

  const handleReset = () => {
    setNumber(1)
  };
  
  const handleDec = () => {
    setNumber(number -1)
  };


  
  return (
    <div>
      <button onClick={handleInc}>+</button>
      <button onClick={handleDec}>-</button>
      <button onClick={handleReset}>Reset</button>
      <h2>Number is {number}</h2>
      <h2>{output}</h2>
    </div>

  );
}

export default App;
