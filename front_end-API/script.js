function cadastrarUsuarios() {
    const nome = document.getElementById('nome').value;
    const email = document.getElementById('email').value;
    const senha = document.getElementById('senha').value;
    const mensagem = document.getElementById('mensagem').value;

    fetch('https://localhost:8080usuarios', {
        method:'POST',
        headers:{
            'Contest-Type' : 'aplication/json'
        },
        body: JSON.stringify({nome, email, senha})
    })
    .then(response => response.json().then(data => ({status: response.status, body: data})))
    .then(({status, body}) => {
        if (status >= 400) {
            let erroMsg = body.mensagem;
            if (body.erros) {
                erroMsg += '' + Object.values(body.erros).join(', ')
            }
            mensagem.textContent = erroMsg;
            mensagem.classList.remove = ('sucesso');
            mensagem.classList.add('erro', 'visivel');
            }else{
                mensagem.textContent = body.mensagem || 'Usuário cadastrado com sucesso.';
                mensagem.classList.remove('erro');
                mensagem.classList.add('sucesso', 'visivel');

                document.getElementById('cadastroForm').reset();
            }
            exibirMensagem();
        })
        .catch(() => {
            mensagem.textContent = 'Erro ao conectar com o servidor.'
            mensagem.classList.remove('sucesso');
            mensagem.classList.add('erro', 'visivel');
            exibirMensagem();
        });
    }

function exibirMensagem(){
    const mensagem = document.getElementById('mensagem');
    mensagem.classList.remove('oculto');
    setTimeout(() => fechaMensagem(), 5000);
}

function fecharMensagem() {
    const mensagem = document.getElementById('mensagem');
    mensagem.classList.remove('visivel');
    setTimeout(() => mensagem.classList.add('oculto'), 5000);
}