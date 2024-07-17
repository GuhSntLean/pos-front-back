import { useLoaderData } from 'react-router-dom';
import styled from 'styled-components';

const ItemDetails = styled.section`
    box-shadow: 0 1px 2px rgba(0,0,0,0.07), 
                0 2px 4px rgba(0,0,0,0.07), 
                0 4px 8px rgba(0,0,0,0.07), 
                0 8px 16px rgba(0,0,0,0.07),
                0 16px 32px rgba(0,0,0,0.07), 
                0 32px 64px rgba(0,0,0,0.07);
    
    float: left;
    flex: 1;
    margin: 10px;
    padding: 10px;

    h3 {
        text-align: center;
        margin-top: 2px;
    
    }
    div {
        display: grid;
    }
`
 
const Items = styled.div`
    display: flex;
`

const ItemDetail = styled.div`
    font-size: smaller;
    padding-bottom: 12px;
    display: grid;
`

const DetailSection = styled.section`
    
    h2 {
        font-size: 18px;
    }
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
            <h1>Localidade {localidade.id}</h1>
            <ItemDetail>
                <label>Descrição</label>
                <span>{localidade.descricao}</span>
            </ItemDetail>        
        </section>
    </Main>
  )
}

export default LocalidadeDetails;