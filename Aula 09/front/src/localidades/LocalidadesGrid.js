import PacoteRow from "./LocalidadeRow.js";

import styled from "styled-components";

const LocalidadeTable = styled.table`
  border-collapse: collapse;
`;

const HeaderRow = styled.tr`
  height: 46px;
  border-bottom: 1px solid;
`;

const HeaderCell = styled.th``;

const EstadoCell = styled(HeaderCell)``;

const LocalidadeCell = styled(HeaderCell)``;

function LocalidadesGrid(props) {
  const { dados } = props;
  const rows = dados.map((x) => <PacoteRow localidade={x} />);

  return (
    <LocalidadeTable>
      <LocalidadeTableHeader />
      {rows}
    </LocalidadeTable>
  );
}

function LocalidadeTableHeader() {
  return (
    <HeaderRow>
      <LocalidadeCell>Localidade</LocalidadeCell>
      <EstadoCell>Estado</EstadoCell>
    </HeaderRow>
  );
}

export default LocalidadesGrid;
