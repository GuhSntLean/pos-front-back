function TabelaInformacao(props) {
    const { dados, index } = props;
    return (
      <tr key={index}>
        <td>{dados.descricao ? dados.descricao : "Sem descrição"}</td>
        <td>
          <ul>
            {dados.items.map((item, index) => {
              return (
                <li key={index} className="item-row">
                  {item.endereco ? (
                    <>
                      <div>{item.nomeHotel}</div>
                      <div>{item.endereco}</div>
                    </>
                  ) : item.companhiaAerea ? (
                    <>
                      <div>{item.companhiaAerea}</div>
                      <div>{item.numeroVoo}</div>
                    </>
                  ) : item.marca ? (
                    <>
                      <div>{item.marca}</div>
                      <div>{item.modelo}</div>
                    </>
                  ) : null}
                </li>
              );
            })}
          </ul>
        </td>
        <td>
          {dados.localidade.descricao
            ? dados.localidade.descricao
            : "Sem descrição"}
        </td>
        <td>{dados.valor ? dados.valor.toFixed(2) : "Sem valor"}</td>
      </tr>
    );
  }
  
  export default TabelaInformacao;