
import styled from 'styled-components';

const Message = styled.p`
  color: #878787;
  font-weight: bold;
`;

const InnerInput = styled.input`
  width: 50%;
  padding: 10px;
  margin: 5px ;
  border: 1px solid #ccc; 
  border-radius: 4px;
`;

function Criteria(props) {
  const {setCriteria} = props;

  const onCriteriaChange = (e) => setCriteria(e.target.value);
  
  return (
    <div style={{display : "flex"}}>
      <Message>Pesquisar : </Message>
      <InnerInput onChange={onCriteriaChange}></InnerInput>
    </div>
  );
}

export default Criteria;