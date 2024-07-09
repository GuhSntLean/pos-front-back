import styled from "styled-components";
import { loadPacotes } from "./stub.js";

const InnerButton = styled.button`
  font-size: 1em;
  color: #878787;
  background-color: none;
  margin: 1em;
  padding: 0.25em 1em;
  border: 3px solid #878787;
  border-radius: 3px;
`;

function Button(props) {
  const { setData } = props;

  const onClick = async () => {
    const data = await loadPacotes();
    setData(data);
  };

  return <InnerButton onClick={onClick}>Carregar</InnerButton>;
}

export default Button;
