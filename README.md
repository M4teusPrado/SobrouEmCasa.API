# SobrouEmCasa.API

## Métodos
Requisições para a API devem seguir os padrões:
| Método | Descrição |
|---|---|
| `GET` | Retorna informações de um ou mais registros. |
| `POST` | Utilizado para criar um novo registro. |
| `PUT` | Atualiza dados de um registro ou altera sua situação. |
| `DELETE` | Remove um registro do sistema. |


## Respostas

| Código | Descrição |
|---|---|
| `200` | Requisição executada com sucesso (success).|
| `400` | Erros de validação ou os campos informados não existem no sistema.|
| `401` | Dados de acesso inválidos.|
| `404` | Registro pesquisado não encontrado (Not found).|
| `405` | Método não implementado.|
| `410` | Registro pesquisado foi apagado do sistema e não esta mais disponível.|
| `422` | Dados informados estão fora do escopo definido para o campo.|
| `429` | Número máximo de requisições atingido. (*aguarde alguns segundos e tente novamente*)|


# Login

## usuarios [{{path}}/login]

Rota destinada para autenticação de login 

### LOGAR [POST]

+ Response 200 (application/json)

          {
              "id": 1,
              "nome": "Mateus",
              "login": "mateus.prado",
              "senha": "123",
              "tipoUsuario": "RESPONSAVEL",
              "cpf": "469.006.198-00",
              "email": "mateus.silvaprado@gmail.com",
              "genero": "MASCULINO",
              "dataNascimento": "2001-08-18T00:00:00.000+00:00",
              "telefone": "(15)32424536",
              "celular": "(15)988047229"
          }

+ Response 404 [Usuario não encontrado] (application/json)

          {
              "timestamp": "2022-05-21T21:26:57.874+00:00",
              "status": 404,
              "error": "Not Found",
              "trace": "org.springframework.web.server.ResponseStatusException: 404 NOT_FOUND \"Usuario não encontrado\"
          }
