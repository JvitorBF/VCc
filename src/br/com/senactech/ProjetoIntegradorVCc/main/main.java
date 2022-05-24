
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.ProjetoIntegradorVCc.main;

import br.com.senactech.projetoIntegradorVCc.controller.CUsuario;
import br.com.senactech.projetoIntegradorVCc.model.Usuario;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class main {

    public static Scanner ler = new Scanner(System.in);
    public static CUsuario cadastroUsuario = new CUsuario();

    public static String leTexto() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }

    public static void menu() {
        System.out.println("\n--- Menu Principal ---");
        System.out.println("1 - Login");
        System.out.println("2 - Cadastro");
        System.out.println("0 - Sair");
        System.out.print("Escolha a sua opção: ");
    }

    // Todo Login
    public static void login() {
        System.out.println("\n\n-- Menu Login --");
        boolean verEmail;
        String email;
        do {
            System.out.print("Email: ");
            email = leTexto();
            if (cadastroUsuario.verEmail(email)) {
                verEmail = false;
            } else {
                verEmail = true;
                System.out.println("Email inválido, tente novamente!");
            }
        } while (verEmail);
        boolean verSenha;
        String senha;
        do {
            System.out.print("Senha: ");
            senha = leTexto();
            if (cadastroUsuario.verSenha(senha)) {
                verSenha = false;
            } else {
                verSenha = true;
                System.out.println("Senha invválida, tente novamente!");
            }
        } while (verSenha);
    }

    // Cadastro de Usuários (Severo e João)
    public static void cadastro() {
        System.out.println("\n\n--- Cadastro de Usuário ---");
        int id;
        int idade;
        boolean status;
        String nome;
        String cpf;
        String endereco;
        String telefone;
        String email;
        String cep;
        String senha;

        do {
            System.out.print("\nInforme o nome do usuário: ");
            nome = leTexto().toUpperCase();
        } while (nome.length() < 4);

        do {
            System.out.print("\nInforme a sua idade: ");
            idade = ler.nextInt();
        } while (idade < 6);

        boolean testaCpf = false;
        do {
            System.out.print("\nInforme o Cpf: ");
            cpf = leTexto();
            if (cpf.matches("\\b\\d{11}\\b")) {
                if (cadastroUsuario.verCpf(cpf)) {
                    System.out.println("\nCpf inválido! Foi digitado incorretamente ou já é um cpf existente.");
                } else {
                    testaCpf = true;
                }
            } else {
                System.out.println("\nCpf inválido! Foi digitado incorretamente ou já é um cpf existente.");
            }
        } while (!testaCpf);

        // Verificação de endereço de email
        boolean testaEmail = false;
        do {
            System.out.print("\nInforme o email: ");
            email = leTexto();
            if (cadastroUsuario.verEmail(email)) {
                System.out.println("\nEmail inválido! Foi digitado incorretamente ou já é um email existente.");
            } else {
                testaEmail = true;
            }
        } while (!testaEmail);

        // Verificação de endereço
        boolean testaEndereco;
        do {
            System.out.print("\nInforme o seu endereço: ");
            endereco = leTexto();
            testaEndereco = endereco.length() > 5;
        } while (!testaEndereco);

        // Cep
        boolean testaCep;
        do {
            System.out.print("\nInforme o seu cep: ");
            cep = leTexto();
            testaCep = cep.length() > 5;
        } while (!testaCep);

        // Verificação de telefone (Matheus e João)
        boolean testaTelefone;
        do {
            System.out.print("\nInforme o telefone/celular com o DDD: ");
            telefone = leTexto();
            testaTelefone = telefone.matches("\\d{11}") || telefone.matches("\\d{10}");
            if (!testaTelefone) {
                System.out.println("\nTelefone/Celular inválido ou já está sendo utilizado.");
            }
        } while (!testaTelefone);

        boolean testaSenha;
        do {
            System.out.print("\nInforme a senha: ");
            senha = leTexto();
            testaSenha = senha.length() > 6;
        } while (!testaSenha);

        System.out.print("\nUsuário está ativo no cadastro? | 1 - Sim! / 2 - Não! |: ");
        byte statusN = ler.nextByte();
        status = statusN == 1;

        id = cadastroUsuario.addIdUsuario();
        Usuario c = new Usuario(id, status, endereco, nome, telefone, email, cep, cpf, senha);
        if (cadastroUsuario.addUsuario(c)) {
            System.out.println("\nCadastrado com sucesso.");
        } else {
            System.out.println("\nErro, usuário não pode ser cadastrado.");
        }
    }

    public static void menuVacinacao() {
        System.out.println("\n-- Saiba tudo sobre a vacinação --");
        System.out.println(" 1 - Onde se vacinar:");
        System.out.println(" 2 - Eficácia:");
        System.out.println(" 3 - Efeitos colaterais:");
        System.out.println(" 4 - Grupos prioritários:");
        System.out.println(" 5 - Calendário de vacinação:");
        System.out.println(" 6 - O que levar para o local de vacinação: ");
        System.out.println(" 0 - Voltar");
        System.out.print("Escolha uma opção: ");
    }

    public static void OndeSeVacinar() {

    }

    public static void Eficacia() {
        System.out.println("-- EFICÁCIA --");
        System.out.println("");
        System.out.print("|");
        System.out.print("---------------------------------------------------------------------------------------------------------------");
        System.out.println("|");
        System.out.print(""
                + "|     Meses após o início da vacinação contra o coronavírus, a diferença que os imunizantes fazem na vida real  |"
                + "\n| está ficando mais clara, cada vacina tem sua eficácia, como a vacina da Pfizer BioNTech contra a COVID-19     |"
                + "\n| tem uma eficácia de 95% contra a infeção sintomática por SARS-CoV-2, já a vacina AstraZeneca contra a         |"
                + "\n| COVID-19 tem uma eficácia de 63,09% contra a infeção sintomática pelo SARS-CoV-2.                             |"
                + "\n| Intervalos mais longos entre as doses, com limites de 8 a 12 semanas, estão associados  a uma maior eficácia  |"
                + "\n| da vacina. E a CoronaVac tem umas das menores taxas de eficácia, a eficácia geral da CoronaVac é 50,38%,      |"
                + "\n| ou seja, os vacinados têm 50,38% menos risco de adoecer.                                                      |"
                + "\n| Dados iniciais mostravam que, caso a pessoa seja infectada por covid-19, a vacina oferece 100% de eficácia    |"
                + "\n| para não adoecer gravemente e 78% para prevenir casos leves.                                                  |"
                + "\n| Isso são a eficácia de somente três vacinas, temos outras como Moderna, Sputnik V, e Janssen que todas tem    |"
                + "\n| grande eficácia também. As vacinas são muito importantes, pois previne e salva muitas vidas, e desde que      |"
                + "\n| a OMS declarou a pandemia do novo coronavírus, em março de 2020, laboratórios e pesquisadores se empenharam   |"
                + "\n| para descobrir vacinas contra a covid-19 e atualmente temos muitas vacinas com grande eficácia ao covid-19,   |"
                + "\n| por isso todos devemos tomar a vacina.                                                                        |");
        System.out.print("\n|");
        System.out.print("---------------------------------------------------------------------------------------------------------------");
        System.out.println("|");
        System.out.println("");
        System.out.println("© 2021 WHO - Todos os direitos reservados");
    }

    public static void EfeitosColaterais() {
        System.out.println("-- Efeitos colaterais comuns das vacinas COVID-19 --");
        System.out.println("");
        System.out.println("As vacinas COVID-19 são seguras, e se vacinar ajudará"
                + " a protegê-lo contra o desenvolvimento de doença severa COVID-19"
                + " e morrer de COVID-19.Você pode experimentar alguns efeitos colaterais"
                + " leves depois de se vacinar, que são sinais de que seu corpo está construindo proteção.");
        System.out.println("");
        System.out.println("-- Efeitos colaterais comuns das vacinas COVID-19 --");
        System.out.println("");
        System.out.println("Como qualquer vacina, a vacina COVID-19 pode causar efeitos colaterais,"
                + " a maioria dos quais são leves ou moderados e irão embora por conta própria em alguns dias."
                + " Conforme demonstrado pelos resultados dos ensaios clínicos, podem ocorrer efeitos colaterais"
                + " mais graves ou de longa duração. A vacina é monitorada continuamente para detectar eventos adversos."
                + "De acordo com relatórios, a maioria dos efeitos colaterais da vacina COVID-19 são leves a moderados e "
                + "não duram mais do que alguns dias. Os efeitos colaterais típicos incluem dor no local da injeção, febre,"
                + " fadiga, dor de cabeça, dor muscular, calafrios e diarreia. A chance de qualquer um desses efeitos colaterais"
                + " após a vacinação varia de acordo com a vacina específica.A vacina COVID-19 só pode prevenir o vírus SARS-CoV-2, portanto, manter a saúde ainda é importante.");
        System.out.println("");
        System.out.println("© 2021 WHO");
    }

    public static void GruposPrioritarios() {
        System.out.println("-- GRUPOS PRIORITÁRIOS --");
        System.out.print("\n ------------------------------------------------------------------------------------");
        System.out.print("                                                                                "
                + "\n|Grupo|                        Grupo prioritário                        | População  |"
                + "\n|     |                                                                 | estimada*  |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|  1  | Pessoas com 60 anos ou mais institucionalizadas                 | 160.472    |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|  2  | Pessoas com Deficiência Institucionalizadas                     | 6.472      |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|  3  | Povos indígenas Vivendo em Terras Indígenas                     | 413.739    |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|  4  | Trabalhadores de Saúde                                          | 7.337.807  |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|  5  | Pessoas de 90 anos ou mais                                      | 893.873    |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|  6  | Pessoas de 85 a 89 anos                                         | 1.299.948  |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|  7  | Pessoas de 80 a 84 anos                                         | 2.247.225  |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|  8  | Pessoas de 75 a 79 anos                                         | 3.614.384  |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|  9  | Povos e Comunidades tradicionais Ribeirinhas                    | 632.815    |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|  10 | Povos e Comunidades tradicionais Quilombolas                    | 1.184.383  |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|  11 | Pessoas de 70 a 74 anos                                         | 5.408.657  |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|  12 | Pessoas de 65 a 69 anos                                         | 7.349.241  |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|  13 | Pessoas de 60 a 64 anos                                         | 9.383.724  |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|     | Pessoas com comorbidades e gestantes e puérperas com            |            |"
                + "\n|     | comorbidades** (n=18.218.730);                                  |            |"
                + "\n|  14 | Pessoas com Deficiência Permanente cadastradas no BPC***        | 22.174.259 |"
                + "\n|     | (n=1.467.477);                                                  |            |"
                + "\n|     | Gestantes e Puérperas (n=2.488.052)                             |            |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|  15 | Pessoas com Deficiência Permanente (18 a 59 anos) sem           | 6.281.581  |"
                + "\n|     | cadastro no BPC***                                              |            |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|  16 | Pessoas em Situação de Rua (18 a 59 anos)                       | 140.559    |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|  17 | Funcionários do Sistema de Privação de Liberdade (n=108.949)    | 862.915    |"
                + "\n|     | e População Privada de Liberdade (n=753.966)                    |            |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|  18 | Trabalhadores da Educação do Ensino Básico (creche, pré-escolas,|            |"
                + "\n|     | ensino fundamental, ensino médio, profissionalizantes e EJA)    | 2.707.200  |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|  19 | Trabalhadores da Educação do Ensino Superior                    | 719.818    |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|     | Forças de Segurança e Salvamento (n=604.511) e Forças Armadas   |            |"
                + "\n|     | (n=364.631) (Na 11ª etapa da Campanha iniciou-se a vacinação    |            |"
                + "\n|  20 | escalonada desses trabalhadores, restrita aos profissionais     | 969.142    |"
                + "\n|     | envolvidos nas ações de combate à covid-19, conforme            |            |"
                + "\n|     | Nota Técnica nº 297/2021)B                                      |            |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|  21 | Trabalhadores de Transporte Coletivo Rodoviário de Passageiros  | 678.264    |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|  22 | Trabalhadores de Transporte Metroviário e Ferroviário           | 73.504     |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|  23 | Trabalhadores de Transporte Aéreo                               | 165.944    |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|  24 | Trabalhadores de Transporte de Aquaviário                       | 41.515     |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|  25 | Caminhoneiros                                                   | 1.241.061  |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|  26 | Trabalhadores Portuários                                        | 111.397    |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|  27 | Trabalhadores Industriais                                       | 5.323.291  |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|  28 | Trabalhadores da limpeza urbana e manejo de resíduos sólidos    | 228.218    |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|     | População de 12 a 17 anos com deficiência permanente, com comor-|            |"
                + "\n| 29  | bidade ou privados de liberdade, bem como as gestantes, as      | 1.851.854  |"
                + "\n|     | puérperas e as lactantes, com ou sem comorbidade, independente- |            |"
                + "\n|     | mente da idade dos lactentes.                                   |            |"
                + "\n|     | (Lei 14.190, de 29 de julho de 2021)                            |            |"
                + "\n|-----|-----------------------------------------------------------------|------------|"
                + "\n|                                   TOTAL                               | 83.503.262 |"
                + "\n|-----------------------------------------------------------------------|------------|"
                + "\n|                  População Geral - Pessoas de 18 a 59 anos            | 76.443.686*|");
        System.out.println("\n ------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println(" De acordo com o governo federal, essa lista somaria mais de 77 milhões de brasileiros.\n"
                + "O ministério recomenda que estados e municípios sigam a ordem da lista acima.\n"
                + "\n"
                + "O Ministério da Saúde afirma que, segundo o Plano Nacional de Imunizações (PNI),\n"
                + "municípios e estados têm “autonomia para montar seu próprio esquema de vacinação\n"
                + "e dar vazão à fila de acordo com características de sua população, demandas específicas \n"
                + "de cada região e doses disponibilizadas”. \n"
                + "");
        System.out.println("Copyright © CGPNI/DEIDT/SVS/MS. *Dados sujeitos a alterações (atualizados em 15/06/2021)\n"
                + "Copyright © Abril Mídia S A. Todos os direitos reservados. ");
    }

    public static void CalendarioDeVacinacão() {

    }

    public static void OqLevarAoLocalDeVacinacao() {
        System.out.println("-- O QUE LEVAR AO LOCAL DE VACINAÇÃO --");
        System.out.println("");
        System.out.print("|");
        System.out.print("-----------------------------------------------------------------------------------------------");
        System.out.println("|");
        System.out.print(""
                + "|   Todas as pessoas serão vacinadas, mesmo que não apresentem algum documento. Basta comprovar |"
                + "\n| que pertence ao grupo prioritário correspondente à fase da vacinação.                         |"
                + "\n| No entanto, para fazer o controle, o Ministério da Saúde diz que é importante informar o      |"
                + "\n| número do CPF ou apresentar o Cartão Nacional de Saúde (CNS) – o Cartão do SUS.               |"
                + "\n|                                                                                               |"
                + "\n| 1. Identidade;                                                                                |"
                + "\n| 2. Cartão SUS;                                                                                |"
                + "\n| 3. Caso for a segunda dose, levar carteira de vacinação.                                      |"
                + "\n|                                                                                               |");
        System.out.print("\n|");
        System.out.print("-----------------------------------------------------------------------------------------------");
        System.out.println("|");
        System.out.println("");
    }

    public static void main(String[] args) {
        int op;
        do {
            menu();
            op = ler.nextInt();
            switch (op) {
                case 1:
                    login();
                    int opM;
                    do {
                        menuVacinacao();
                        opM = ler.nextInt();
                        switch (opM) {
                            case 1:
                                //OndeSeVacinar
                                break;
                            case 2:
                                //Eficacia
                                break;
                            case 3:
                                EfeitosColaterais();
                                break;
                            case 4:
                                //GruposPrioritários
                                break;
                            case 5:
                                //CalendárioDeVacinação
                                break;
                            case 6:
                                //OqueLevaraoLocalDeVacinação
                                break;
                            case 0:
                                System.out.println("Retornando ao menu principal!");
                                break;
                            default:
                                System.out.println("Opção inválida, tente novamente!");
                                break;
                        }
                    } while (opM != 0);
                    break;
                case 2:
                    cadastro();
                    break;
                case 0:
                    System.out.println("\nFinalizando o programa.");
                    break;
                default:
                    System.out.println("\nOpção inválida, tente novamente.");
            }
        } while (op != 0);
    }

}
