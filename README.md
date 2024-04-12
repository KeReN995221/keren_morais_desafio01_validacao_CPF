# By: Keren Apuque Cardoso de Morais
## contato: keren.morais.pb@compasso.com.br


Este repositório segue padrões de commit do Git para uma melhor organização e entendimento do histórico de alterações.

## Padrões de Commit

1. **feat**: Para novas funcionalidades ou adições.
2. **fix**: Para correções de bugs.
3. **docs**: Para alterações na documentação.
4. **style**: Para modificações que não afetam o comportamento do código (espaços em branco, formatação, etc.).
5. **refactor**: Para refatorações de código que não alteram seu comportamento.
6. **perf**: Para melhorias de desempenho.
7. **test**: Para adição ou modificação de testes.
8. **chore**: Para tarefas de manutenção do projeto, como atualizações de dependências, configurações, etc.

### - task-01: implementei inicialmente o método de verificação dentro da própria classe Cpf, no entanto  movi os métodos para uma nova classe chamada Validação criei dentro do pacote de serviços.
### - task-02: método de verificar letras foi invocado após a validação da quantidade de caracter
### - task-03: nesta etapa inicialmente implementei um metodo modificador set no objeto cpf no entanto após a daily de decisão foi notificado que a lista deveria ser apenas manipulada e não alterada. Portanto, ao modificar meu método verifiquei a necessidade de forçar um acoplamento entre os métodos de: Verificação do tamanho do cpf e Verificação de existe apenas números, reconheço que pelas lentes da Orientação à Objetos esta não é uma das melhores soluções. 