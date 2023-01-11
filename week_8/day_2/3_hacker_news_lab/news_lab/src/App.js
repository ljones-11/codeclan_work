import './App.css';
import NewsContainer from './containers/NewsContainer';
import Header from './components/Header';

function App() {
  return (
    <div className='page-div'>
      <Header />
      <NewsContainer />
    </div>
  );
}

export default App;
