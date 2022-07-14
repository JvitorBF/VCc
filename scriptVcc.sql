# create schema devm211vcc;

-- CUIDADO AO EXECUTAR O SCRIPT 

/*só executem todo ele quando for a primeira vez. Para isso tire o comentário
do 'create schema devm211vcc', e cliquei no raio que executa todo o script*/

/* Toda modificação feita nas tabelas devem ser executadas aqui no script.sql,
caso queiram testar em uma query separada, sintam-se livres para isso. Porém
não esqueçam, a modificação irá acontecer "localmente". Modifiquem o 
'CREATE TABLE' OU 'INSERT INTO' aqui nesse script.sql. Porque se não toda vez 
em que alguém for executar o script, ele estará desatualizado.*/

-- TIPS

# 'CREATE TABLE nome_tabela' = cria a tabela 
# 'INSERT INTO nome_tabela VALUES' = inseri dados na tabela
# 'SELECT * FROM nome_tabela' =  exibe os dados da tabela
# 'UPDATE nome_tabela SET nome_coluna = 'valor' WHERE nome_coluna = 'valor de referência' = inseri novos dados a uma coluna específica
# 'DROP TABLE nome_tabela' = exclui a tabela inteira
# 'DELETE from nome_tabela' = assim eclui todas as linhas da tabela

/*private int idUsuario;
    private boolean status;
    private String endereco;
    private String nome;
    private String telefone;
    private String email;
    private String cep;
    private String cpf;
    private String senha;*/

use devm211vcc;

create table usuario (
	id int primary key auto_increment,
    nome varchar(60),
    telefone varchar(12) not null,
    email varchar(60) not null, 
    cpf varchar(11) not null unique,
    cep varchar(9) not null,
    endereco varchar(120) not null,    
    senha varchar(120) not null,
    status boolean      
);

INSERT INTO usuario (id, nome, telefone, email, cpf, cep, endereco, senha, status) VALUES (
	null,
    'João Vitor',
    '51999919750',
    'jvitorbf35@gmail.com',
    '05380419003',
    '92990000',
    'conzatti 459',
    'abc123',
	true
);	

/* ADICIONEM O LOGIN DE VOCÊS */

