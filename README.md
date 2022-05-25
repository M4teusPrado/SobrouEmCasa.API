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


# Documentação

## Requisitos para compilação

Clonar repositorio

Clone [https://github.com/M4teusPrado/SobrouEmCasa.API.git](https://github.com/M4teusPrado/SobrouEmCasa.API.git)

- Instalar JDK

    Para instalar o JDK no Linux ou no Windows primeiramente é necessário efetuar o download do arquivo de instalação. Para isso deve-se acessar o site da Oracle (vide seção Links) e baixar versão do JDK correspondente ao sistema operacional e arquitetura (32 ou 64 bits) utilizada.

    Após o download do arquivo de instalação ter sido concluído, 

    Windows: 

    Executar o programa de instalação e clicar no botão Next em todas as telas apresentadas. 

    Linux: 

    ```python
    Estando no modo gráfico, abrir um Terminal e digitar os comandos abaixo

          $ sudo add-apt-repository ppa:webupd8team/java
          $ sudo apt-get update
          $ sudo apt-get install oracle-java8-installer
    ```

    **Configuração básica**

    A configuração básica do JDK consiste na criação das variáveis de ambiente *JAVA_HOME* e *CLASSPATH*. Estas variáveis são importantes para que os programas relacionados ao desenvolvimento de aplicações Java possam encontrar, no diretório onde o JDK foi instalado, as diversas bibliotecas para a construção de softwares Java.

    Windows:

    ```python
    - Abrir um Prompt do MS-DOS

        - Executar os comandos abaixo

          setx JAVA_HOME "<diretório-onde-jdk-foi-instalado>"
          setx CLASSPATH %JAVA_HOME%\lib
          setx PATH %PATH%;%JAVA_HOME%\bin

        - Fechar o Prompt do MS-DOS

    ```

    Linux:

    ```
    Estando no modo gráfico, abrir um Terminal

        - Editar o arquivo /etc/profile com o comando abaixo

          $ sudo gedit /etc/profile

        - Adicionar as linhas abaixo no inicio do arquivo /etc/profile

          JAVA_HOME=diretório-onde-jdk-foi-instalado
          CLASSPATH=.;$JAVA_HOME/lib
          PATH=$PATH:$JAVA_HOME/bin
          export JAVA_HOME
          export CLASSPATH
          export PATH

        - Salvar o arquivo e efetuar um logoff para que as variáveis de ambiente entrem em vigor.
    ```

- Instalação do Maven

    Downloading Apache Maven 3.8.1: [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi)

Agora bastar apertar com o botão direito do mouse em sua interface, e clicar em run 

### Arquitetura do projeto

Controller: Recebe requisições do usuário e repassa ao service

Service: Service funciona como uma camada de serviços interagindo tanto com a entidades e também com o repository 

Model: Camada onde é possível criar as entidades

Repository: Tem como funcionalidade salvar armazenar entidades


# Login

## usuarios [url/login]

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
