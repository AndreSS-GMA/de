# 📋 Requisitos e Cartões de História do Usuário

Este documento contém a elicitação de requisitos ágeis do MVP da Cupcakekaria, estruturados para garantir a rastreabilidade e a qualidade (QA) do desenvolvimento.

---

### ID: US-01 - Vitrine Dinâmica de Produtos
**Requerente:** Cliente final da confeitaria
**Ação:** Visualizar a lista de cupcakes gourmet disponíveis contendo foto, nome, descrição e preço, para permitir a escolha rápida dos sabores.
**Comentários:** O layout precisa ser intuitivo e gerar credibilidade visual (design responsivo), mitigando a frustração que o proprietário da loja teve com o desenvolvimento da equipe anterior.

**Critérios de aceitação (QA):**
* **CA#1:** O sistema deve carregar os dados dos produtos dinamicamente através de uma API conectada ao banco de dados MySQL.
* **CA#2:** A interface visual deve exibir os itens em formato de cartões (Cards).
* **CA#3:** As imagens devem possuir proporção padronizada (object-fit) para evitar distorções visuais.

**Regras de negócio:**
* **RN#1:** Apenas os cupcakes que estiverem cadastrados e ativos no banco de dados (`pit_cupcake`) podem aparecer na tela.
* **RN#2:** A nomenclatura padrão deve concatenar automaticamente o prefixo "Cupcake de" com o sabor vindo do banco.

**Requisito não funcional:**
* **RNF#1 (Usabilidade):** O sistema deve ser responsivo, funcionando perfeitamente tanto em navegadores Desktop quanto em telas de dispositivos Mobile.
* **RNF#2 (Desempenho):** A consulta à API e o carregamento da vitrine não devem ultrapassar 3 segundos.

**Prioridade:** [A] (Crítica / Bloqueante)
**Pontos de história:** 5

---

### ID: US-02 - Gestão do Carrinho de Compras
**Requerente:** Cliente final da confeitaria
**Ação:** Adicionar os cupcakes desejados a um resumo de pedido exibido na mesma tela, para manter o foco na vitrine durante a seleção.
**Comentários:** O carrinho operará via Front-end (MVP) utilizando JavaScript para garantir resposta em tempo real, sem necessidade de recarregar a página a cada clique.

**Critérios de aceitação (QA):**
* **CA#1:** Ao clicar no botão "Adicionar", o produto deve refletir imediatamente na lista lateral/inferior de resumo.
* **CA#2:** A lista de resumo deve exibir a quantidade exata multiplicada (ex: 2x Cupcake de Morango).
* **CA#3:** O valor unitário e o subtotal devem respeitar a formatação de moeda brasileira (R$ 00,00).

**Regras de negócio:**
* **RN#1:** Se um produto já existente no carrinho for selecionado novamente, o sistema não deve criar uma nova linha, mas sim incrementar a quantidade do item existente em +1.

**Requisito não funcional:**
* **RNF#1 (Confiabilidade):** O sistema deve manter o estado do carrinho preciso mesmo em caso de múltiplos cliques rápidos.

**Prioridade:** [A] (Crítica / Bloqueante)
**Pontos de história:** 3

---

### ID: US-03 - Totalizador e Finalização de Pagamento
**Requerente:** Cliente final da confeitaria
**Ação:** Visualizar o cálculo automático do valor total do pedido e ter acesso a um botão de pagamento claro para concluir a transação com transparência.
**Comentários:** Nesta fase de MVP, o pagamento será simulado via Front-end, exibindo um relatório final da compra.

**Critérios de aceitação (QA):**
* **CA#1:** A soma de todos os subtotais do carrinho deve refletir instantaneamente no campo "Total".
* **CA#2:** Ao clicar em "Pagar Compra", o sistema deve exibir um extrato da compra contendo os itens, quantidades e valor final.
* **CA#3:** Após o fechamento do alerta de pagamento, o carrinho deve ser limpo automaticamente.

**Regras de negócio:**
* **RN#1:** O botão de pagamento deve possuir uma validação que impeça a conclusão caso o carrinho esteja vazio (Total = 0).

**Requisito não funcional:**
* **RNF#1 (Segurança):** Cálculos financeiros de subtotal e total devem ser tratados com precisão decimal no código para evitar arredondamentos indevidos.

**Prioridade:** [B] (Alta / Essencial)
**Pontos de história:** 3