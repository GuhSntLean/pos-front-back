function DetalhesTabela(props) {
  const { pacote, index } = props;
  return (
    <tr key={index}>
      <td>{pacote.descricao ? pacote.descricao : "Sem descrição"}</td>
      <td>
        <ul>
          {pacote.items.map((item, index) => {
            return (
              <li key={index} className="item-row">
                {item.endereco ? (
                  <>
                    <div>{item.nomeHotel}</div>
                    <div>{item.endereco}</div>
                  </>
                ) : item.companiaAerea ? (
                  <>
                    <div>{item.companiaAerea}</div>
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
        {pacote.localidade.descricao
          ? pacote.localidade.descricao
          : "Sem descrição"}
      </td>
      <td>{pacote.valor ? pacote.valor.toFixed(2) : "Sem valor"}</td>
    </tr>
  );
}

export default DetalhesTabela;
