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

const DescricaoCell = styled(HeaderCell)``;

const LocalidadeCell = styled(HeaderCell)``;

const ValorCell = styled(HeaderCell)`
  text-align: right;
  padding-right: 12px;
`;

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
    </HeaderRow>
  );
}

export default LocalidadesGrid;
