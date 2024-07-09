import styled from "styled-components";
import DetalhesTabela from "./DetalhesTabela";

const Message = styled.p`
  color: #878787;
  font-weight: bold;
`;

function Pacotes(props) {
  const { dados } = props;

  console.log(dados);

  if (dados.length === 0) {
    return (
      <Message>
        <p>Não há pacotes carregados</p>
      </Message>
    );
  } else {
    return (
      <>
        <Message>{dados.length} pacotes carregados</Message>
        <table className="tabela">
          <thead>
            <tr>
              <th>Descrição</th>
              <th>Hotéis</th>
              <th>Localidade</th>
              <th>Valor</th>
            </tr>
          </thead>
          <tbody>
            {dados.map((pacote) => {
              return <DetalhesTabela pacote={pacote} index={pacote.index} />;
            })}
          </tbody>
        </table>
      </>
    );
  }
}

export default Pacotes;
