document.addEventListener('DOMContentLoaded', () => {
  console.log('JavaScript loaded');

// #######################################################

const handleFormSubmit = function(event){
  event.preventDefault()

const resultList = document.querySelector('#reading-list');
const newListItem = document.createElement('li')

newListItem.textContent = `Title: ${event.target.title.value} Author: ${event.target.author.value} Category: ${event.target.category.value}` ;
const list = document.querySelector('ul')
list.appendChild(newListItem)
form.reset();

}


const form = document.querySelector('#new-item-form');
form.addEventListener('submit', handleFormSubmit)

const newListItem = document.createElement('li');
    newListItem.textContent = '';
    const list = document.querySelector('ul');
    list.appendChild(newListItem);

})
