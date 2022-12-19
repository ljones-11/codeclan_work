// 1. which element will be dipatching the event (eg document)
// 2. which event should we listen for? (eg DomContentLoaded)
// 3. which piece of code should we run when the event is dispatched? (eg the callback)

document.addEventListener('DOMContentLoaded', () => {
  console.log('JavaScript has loaded');

  // #########################################################################

  const handleButtonClick = function (){
    const resultParagraph = document.querySelector('#button-result');
    resultParagraph.textContent = 'That button has 100% been clicked';
  }
  const button = document.querySelector('#button');
  button.addEventListener('click', handleButtonClick);

// #########################################################################

  const handleInput = function (event){
    // 1. get the value from the input
    // 2. update the paragrah text.
    const resultParagraph = document.querySelector('#input-result');
    resultParagraph.textContent = `You typed ${event.target.value}`;
  }

  const textInput = document.querySelector('#input')
  textInput.addEventListener('input', handleInput);

  // #########################################################################

  const handleSelect = function (event){
    const resultParagraph = document.querySelector('#select-result');
    resultParagraph.textContent = `Your selected ${event.target.value}`;
  }
  
  
  const select = document.querySelector('#select')
  select.addEventListener('change', handleSelect);

  // #########################################################################
    
  const handleFormSubmit = function (event){
  // this prevents the defualt behaviour of submitting a post request before the data can be displayed in the browser
  event.preventDefault(); 
    const resultParagraph = document.querySelector('#form-result');
    resultParagraph.textContent = `It's going to be ${event.target.first_name.value} ${event.target.last_name.value}`;
  }

  const form = document.querySelector('#form')
  form.addEventListener('submit', handleFormSubmit)


  


});
