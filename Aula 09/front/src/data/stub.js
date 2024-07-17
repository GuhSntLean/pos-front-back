const ULR = "http://localhost:8080/";

// Pacotes
async function loadPacotes(criteria) {
  const response = await fetch(endpointFor(criteria, "pacotes"));
  const data = await response.json();
  console.log(`Carregado pacotes (payload : ${data})`);
  return data;
}

async function loadPacote(id) {
  const endpoint = `${ULR}pacotes/${id}`;
  const response = await fetch(endpoint);
  const data = await response.json();
  console.log(`Carregado pacote (payload : ${data})`);
  return data;
}

// Localidades
async function loadLocalidates(criteria) {
  const response = await fetch(endpointFor(criteria, "localidades"));
  const data = await response.json();
  console.log(`Carregado localidades (payload : ${data})`);
  return data;
}

async function loadLocalidade(id) {
  const endpoint = `${ULR}localidades/${id}`;
  const response = await fetch(endpoint);
  const data = await response.json();
  console.log(`Carregado localidades (payload : ${data})`);
  return data;
}

function endpointFor(criteria, path) {
  const endpoint = `${ULR}${path}`;

  if (criteria) {
    return `${endpoint}?q=${criteria}`;
  } else {
    return endpoint;
  }
}

export { loadPacotes, loadPacote, loadLocalidates, loadLocalidade };
