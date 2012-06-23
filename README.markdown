JSF Issue Tracker Project
=========================

<<<<<<<<<<<<<< ENGLISH  >>>>>>>>>>>>>
-------------------------------------

This project is a simple issue tracker using the following tecnologies: `JSF 2.x`, `Primefaces(3.3.1)`,` Primefaces extensions 0.5.1`, `CDI(Weld shiped with JBoss 7)`, `CODI(1.0.5)`, Conventions(0.9.1-SNAPSHOT) e `Hibernate 4.1.4` with the intention of showing some features of each tecnologies and how to integrate them in a real project.
  
Its yet another version of the project https://github.com/rponte/jsf-issuetracker-project which is built during the courses and trainings of **JSF 2, Spring and Hibernate** lead by [TriadWorks](http://www.triadworks.com.br).

If you have any doubt or interest about TriadWorks, get in touch with them at (http://www.triadworks.com.br/contatos.html) 

Configuring project database.

By default the project is configured to run in Postgresql database, but as its about an ORM based app it should run in any other SQL based datatabse. 

Basic steps;

1. Import the project in [Eclipse Java EE IDE for Web Developers (Indigo)](http://www.eclipse.org/downloads/) or superior;  
2. Set JBoss AS 7 as runtime enviroment of the project.
3. deploy the app in `JBoss AS 7.x` and start the server (you can use run as in eclipse);
4. Access the application at [http://localhost:8080/issuetracker](http://localhost:8080/issuetracker];
5. login with user:admin, pass:admin (first access this user is created);

Generating the .war
------------------------
1. To generate the `.war` of issuetracker just run the ant script (`build.xml`) from eclipse or in command line;

		$ ant

2 - after the execution the ant script will place the generated `.war` at `/target/war/snapshot/issuetracker.war`;

3 - also you can execute the `Run As` command in eclipse by right clicking in the project (instead of generating the `.war` and deploying it in JBoss), you must have jboss as target enviroment;

Additional information
------------------------

* the database schema , `issuetracker`, will be created by `Hibernate` at first application startup time; 
* in `/etc/lib` directory you find all libraries and dependencies of each framework;
* in `/etc/lib/jdbc-drivers` folder you'll find some JDBC drivers like `MySQL`, `PostgreSQL` and `Oracle`;
* in `/etc/mockups` folder you'll find the screens prototypes.
* as im very bad designer the application css was copied(and slighted modified) from [vraptor-blank-project](http://vraptor.caelum.com.br/en) from Caelum; 

Information ++
----------------

**TriadWorks**
- http://www.triadworks.com.br
- http://www.triadworks.com.br/servico.html

**Rafael Ponte (the JSF and Spring guy)**
- [blog](http://www.rponte.com.br)
- Twitter [@rponte](http://twitter.com/#!/rponte)

**Rafael Pestano (the CDI adventurer)**
- [blog](http://rpestano.wordpress.com/)
- Twitter [@realpestano](http://twitter.com/#!/realpestano)
- Homebrew framework used in this project (http://code.google.com/p/jsf-conventions-framework/).

**JSF Group (the group where we spread our crazy ideas)**
- https://groups.google.com/group/javasf/


<<<<<<<<<<<<<< Português  >>>>>>>>>>>>>
---------------------------------------

Projeto simples de uma aplicação de Issue Tracker com `JSF 2.x`, Primefaces(3.3.1), `CDI(OpenWebBean 1.1.4)`, `CODI(1.0.5)`, Conventions(0.9-SNAPSHOT) e `Hibernate 4.1.4` com o objetivo de explanar as principais features de cada tecnologia e como integra-las de maneira produtiva em um projeto real. 

Esta é mais uma versão do projeto https://github.com/rponte/jsf-issuetracker-project que é construído durante os cursos e treinamentos de **JSF 2, Spring e Hibernate** ministrados pela [TriadWorks](http://www.triadworks.com.br).

Caso tenha interesse ou alguma dúvida sobre os cursos e treinamentos da TriadWorks, entre em contato com (http://www.triadworks.com.br/contatos.html).

Configurando o projeto e banco de dados.
----------------------------------------

Por padrão o projeto está configurado para o banco de dados `PostgreSQL`, mas já que se trata de uma aplicação com `Hibernate`, você pode simplesmente configura-lo para trabalhar com qualquer outro banco.

Os passos básicos são:

1. Importe o projeto no [Eclipse Java EE IDE for Web Developers (Indigo)](http://www.eclipse.org/downloads/) ou superior; 
2. configure o JBoss 7 como runtime da app (você deve ter o JBoss 7 configurado no eclipse).
3. faça deploy da aplicação no `JBoss AS 7.x` (você pode utilizar o comando `run as` da IDE);

Gerando .war da aplicação
------------------------
1. Para gerar o `.war` da aplicação basta executar o ant script (`build.xml`) no Eclipse ou na linha de comando:

		$ ant

2. Após ter executado o ant script o `.war` será gerado em `/target/war/snapshot/issuetracker.war`;

Informações adicionais
------------------------

* O schema do banco de dados, `issuetracker`, será criado pelo `Hibernate` ao iniciar a aplicação pela primeira vez;
* Dentro do diretório `/etc/lib` você encontra todas as libs e dependências organizadas de cada framework;
* Dentro do diretório `/etc/lib/jdbc-drivers` é possível encontrar alguns drivers já disponíveis, como `MySQL`, `PostgreSQL` e `Oracle`;
* Dentro do diretório `/etc/mockups` você encontra os mockups (esboços) das telas da aplicação;
* Como eu sou um péssimo Web designer, o design da aplicação foi copiado (e levemente modificado) do projeto [vraptor-blank-project](http://vraptor.caelum.com.br/en) da Caelum;

Mais informações
----------------

**TriadWorks**
- http://www.triadworks.com.br
- http://www.triadworks.com.br/servico.html

**Rafael Ponte**
- Meu [blog](http://www.rponte.com.br)
- Meu Twitter [@rponte](http://twitter.com/#!/rponte)

**Rafael Pestano**
- Meu [blog](http://rpestano.wordpress.com/)
- Meu Twitter [@realpestano](http://twitter.com/#!/realpestano)
- framework caseiro usado neste projeto (http://code.google.com/p/jsf-conventions-framework/).


**JSF Group**
- https://groups.google.com/group/javasf/


