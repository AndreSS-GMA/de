# 🧁 Cupcakekaria - Projeto PIT

Este é o Produto Mínimo Viável (MVP) do projeto **Cupcakekaria**, desenvolvido como requisito acadêmico para o Projeto de Integração Tecnológica (PIT) do curso de Engenharia de Software da Universidade Cruzeiro do Sul.

O sistema é uma aplicação web completa (Full-Stack) que simula uma loja de cupcakes, contando com integração a banco de dados relacional e um carrinho de compras dinâmico no front-end.

## 🛠️ Tecnologias Utilizadas

* **Back-end:** Java com framework Spring Boot.
* **Banco de Dados:** MySQL (com persistência via Spring Data JPA / Hibernate).
* **Front-end:** HTML5, CSS3 e JavaScript Vanilla (DOM e LocalStorage).
* **Hospedagem Planejada:** Arquitetura para implantação em nuvem (ex: Render/AWS para a API e Clever Cloud para o Banco de Dados).

## ⚙️ Funcionalidades Atuais

* [x] Listagem dinâmica de produtos consumindo a API REST (`/api/cupcakes`).
* [x] Formatação visual em formato de vitrine (Cards).
* [x] Carrinho de compras reativo no Front-end, capaz de somar e atualizar quantidades instantaneamente.
* [x] Cálculo matemático automático do valor total.
* [x] Simulação de finalização de pagamento com resumo estruturado do pedido.

## 🚀 Como rodar o projeto na sua máquina

### Pré-requisitos
Para testar o sistema, você precisará ter instalado em sua máquina:
* **Java 17** (ou superior)
* **MySQL Server** e **MySQL Workbench**
* Uma IDE de sua preferência (VS Code, Eclipse ou IntelliJ)

### Passo a Passo da Instalação

1. **Clone o repositório ou baixe o arquivo ZIP:**
   Faça o download de todos os arquivos deste repositório para o seu computador.

2. **Crie o Banco de Dados:**
   Abra o MySQL Workbench, abra o arquivo `banco_de_dados.sql` (encontrado na raiz deste projeto) e execute o script. Ele criará o banco `pit_cupcake`, a tabela e inserirá as imagens e dados dos cupcakes automaticamente.

3. **Configure a Senha do Banco:**
   No VS Code, abra o arquivo `src/main/resources/application.properties`. 
   Altere o valor da linha `spring.datasource.password=` para a senha do seu usuário `root` do MySQL local.

4. **Inicie o Servidor Java:**
   Rode o arquivo principal `DemoApplication.java`. Aguarde o terminal indicar que o servidor Tomcat foi inicializado na porta 8080.

5. **Acesse a Aplicação:**
   Abra o seu navegador web (Chrome, Edge, Safari) e acesse:
   `http://localhost:8080`

---
*Projeto desenvolvido para fins acadêmicos.*