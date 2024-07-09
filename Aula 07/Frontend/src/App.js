import { useState } from "react";
import Button from "./Button.js";
import Pacotes from "./Pacotes.js";

function App() {
  const [dados, setData] = useState([]);

  return (
    <>
      <Button setData={setData} />
      <Pacotes dados={dados} />
    </>
  );
}

export default App;
