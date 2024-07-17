import { useLoaderData } from 'react-router-dom';
import styled from 'styled-components';

const ItemDetail = styled.div`
    font-size: smaller;
    padding-bottom: 12px;
    display: grid;
`


const Main = styled.main`
    padding: 10px;
    label {
        font-weight: bold;
    }
`
function LocalidadeDetails(props) {
  const localidade = useLoaderData();
  
  return (
    <Main>
        <section>
            <h1>Localidade ID:  {localidade.id}</h1>
            <ItemDetail>
                <label>Estado</label>
                <span>{localidade.estado}</span>
            </ItemDetail>    
            <ItemDetail>
                <label>Cidade</label>
                <span>{localidade.descricao}</span>
            </ItemDetail>      
        </section>
    </Main>
  )
}

export default LocalidadeDetails;