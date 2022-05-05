
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

    }

    public static void CalendarioDeVacinacão() {

    }

    public static void OqLevarAoLocalDeVacinacao() {

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
