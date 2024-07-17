import { loadPacotes } from "./stub.js";

function onLoadPacotes() {
    const placeholder = document.getElementById("placeholder");
    const total = document.getElementById("total");
    placeholder.innerHTML = "<p>Loading</p>"
    loadPacotes((datas) => {
        console.log(datas);
        let html = '<table class="tabela">';

        html += '<tr>';
        html += '<th>Descrição</th>';
        html += '<th>Hotéis</th>';
        html += '<th>Localidade</th>';
        html += '<th>Valor</th>';
        html += '</tr>';
        let i = 0;
        while (i < datas.length) {
            const data = datas[i]; 
            html += '<tr>';
            html += `<td>${data.descricao}</td>`;
            html += '<td><ul>';
            data.items.forEach(item => {
                html += '<li class="item-row">';
                // Decida quais campos exibir com base no tipo de item
                if (item.endereco) {
                    html += `<div>${item.nomeHotel}</div>`;
                    html += `<div>${item.endereco}</div>`;
                } else if (item.companiaAerea) {
                    html += `<div>${item.companiaAerea}</div>`;
                    html += `<div>${item.numeroVoo}</div>`;
                } else if (item.marca) {
                    html += `<div>${item.marca}</div>`;
                    html += `<div>${item.modelo}</div>`;
                }
                html += '</li>';
            });
            html += '</ul></td>';
            html += `<td>${data.localidade.descricao}</td>`;
            html += `<td>R$ ${data.valor.toFixed(2)}</td>`;
            html += '</tr>';
            
            i++;
        }
        html += '</table>';
        placeholder.innerHTML = html
        total.innerHTML=`<p>${datas.length} pacotes carregados</p>`;
    })
}


export { onLoadPacotes };