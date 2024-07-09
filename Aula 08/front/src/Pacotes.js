import styled from "styled-components";
import TabelaInformacao from "./TabelaInformacao";

const Message = styled.p`
  color: #878787;
  font-weight: bold;
`;

function Pacotes(props) {
  const { dados } = props;

  return (
    <>
      {dados.length === 0 ? (
        <Message> Não foi encontrado informações ... </Message>
      ) : (
        <Message>{dados.length} pacotes carregados</Message>
      )}
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
          {dados.map((pacote, index) => {
            return (
              <TabelaInformacao dados={pacote} index={index} key={index} />
            );
          })}
        </tbody>
      </table>
    </>
  );
}

export default Pacotes;
