
# Estudo do GIT

## Controle de Versão 

São a formas que temos dentro do desenvolvimento do software, para gerenciar o ciclo de evolução do código fonte. Controlar as alterações.

Um sistema de controle de versões na função prática da Ciência da computação e da engenharia de software, é um software que tem a finalidade de gerenciar diferentes versões no desenvolvimento de um documento qualquer.E esses sistemas são comumente utilizados no desenvolvimento de software para controlar as diferentes versões - historico e desenvolvimento - dos codigos fontes e tamb~´em da documentação(wikipedia)

## Ferramentas de Controle de Versão 
 - Subversion/SVN
 - MERCURIAL
 - CVS
 - GIT
 
 ## Conhecendo o GIT
 Git é um sistema de controle de versão distribuido e um sistema de gerenciamento de codigo fonte, com enfase em velocidade. O Git foi inicalmente projetado e desenvolvido por Linus Torvalds  para o desenvolvimento do Kernel Linux, mais foi adotado por muitos outros projetos.
 
 
 ## Comandos GIT
 
 - Git init                             -  Criar repositorio (Inicializar o repositorio)
 - Git clone                            - Clonar repositorio
 - Git add. || git add <<nome_arquivo>> - Adicionar todos os arquivos || Adicionar um arquivo especifico
 - Git commit -m 'mensagem de commit'   - Informar a mensagem do commit 
 - Git push                             - Enviar os arquivos para o repositorio Remoto 
 - Git pull                             - Capturar os arquivos modificados do repositorio do remoto
 - Git Merge                            - Juntar alterações entre duas branches, resolver conflitos.
 - Git Status                           - Informações sobre o estado atual do projeto.
 - Git Log                              - Historico de alterações
 - Git Branch                           - Criar uma nova branch(Ramificação)
 
 ## Criação Repositorio 

 Mkdir projeto-curso-git (Criar o repositorio) </br>
 cd Projeto-curso-git (Acessar o repositorio)  </br>
 git init (Inicar um Vazio)                    </br>
 
 - Mensagem quando está correto 
 Initialized empty Git Repository in /home/eduardo/Documentos/projeto-curso-git/.git
 
 ## Criando um arquivo e verificando o status em um repositorio GIT
 
 - touch index.html (O comando linux TOUCH irá criar um novo arquivo no diretório do repositório chamado index.html)
 - git status (o comando git status irá nos mostrar o que foi alterado no diretorio)
 
 ## Criando arquivo e verificando o status em um repositorio GIT
 
 git add.
 git add index.html
 git status
 
 ## Commitando em um repositorio GIT
 
 git commit -m 'Meu Primeiro Commit'
 
 ## Ver Historico
 
 git log (Exibe historico listando todos os commits, que o projeto sofreu até o momento atual)
 
 ## Utilizando Git em repositorio Remoto
 
 Para ser capaz de colabora com qualquer  projeto, envolvendo e gerenciando esses repositorios remotos e fazer push e pull de dados neles quando voce precisa compartilhar trabalho.Gerenciar repositorios remotos que não são mais validos, gerenciar varios branches remotos e definilos como monitorados ou não,e mais. Nesta seção vamos cobrir essas habilidades de gerenciamento remoto.
 
 
 ## Utilizando Git em um repositorio remoto -ferramenteas
 
 BITBUCKET
 GITLAB
 GITHUB
 
 
 

