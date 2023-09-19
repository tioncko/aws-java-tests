package VerificandoSenhas;

import java.util.Scanner;
import java.util.regex.Pattern;

public class VerificandoSenhas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Digite a senha para verificar a força:");
        String senha = scanner.nextLine();
        //scanner.close();

        String resultado = verificarForcaSenha(senha);
        System.out.println(resultado);
    }

    public static String verificarForcaSenha(String senha) {
        int comprimentoMinimo = 8;
        //String ShortPass = "Sua senha e muito curta. Recomenda-se no minimo 8 caracteres.";
        //String CorrectPass = "Sua senha atende aos requisitos de seguranca. Parabens!";
        //String NotPass = "Sua senha nao atende aos requisitos de seguranca.";
        String returnMessage = "";

        // Critérios de validação usando expressões regulares
        boolean temLetraMaiuscula = Pattern.compile("[A-Z]").matcher(senha).find();
        boolean temLetraMinuscula = Pattern.compile("[a-z]").matcher(senha).find();
        boolean temNumero = Pattern.compile("\\d").matcher(senha).find();
        boolean temCaractereEspecial = Pattern.compile("\\W").matcher(senha).find();
        boolean temSequenciaComum = senha.matches(".*(?i)123456.*|.*(?i)abcdef.*");
        boolean temPalavraComum = senha.equalsIgnoreCase("password") || senha.equalsIgnoreCase("123456") || senha.equalsIgnoreCase("qwerty");

        // TODO: Verifique o comprimento mínimo e critérios de validação

        if (senha.length() < comprimentoMinimo) {
            returnMessage = "Sua senha e muito curta. Recomenda-se no minimo 8 caracteres.";
        }

        if (senha.length() >= comprimentoMinimo) {
            if (temLetraMaiuscula) {
                if(temLetraMinuscula) {
                    if(temNumero) {
                        if(temCaractereEspecial) {
                            if(!temSequenciaComum) {
                                if(!temPalavraComum) {
                                    returnMessage = "Sua senha atende aos requisitos de seguranca. Parabens!"; }}}}}}}

        if (senha.length() >= comprimentoMinimo) {
            if (!temLetraMaiuscula) {
                if(temLetraMinuscula) {
                    if(temNumero) {
                        if(temCaractereEspecial) {
                            if(!temSequenciaComum) {
                                if(!temPalavraComum) {
                                    returnMessage = "Sua senha nao atende aos requisitos de seguranca."; }}}}}}}

        if (senha.length() >= comprimentoMinimo) {
            if (temLetraMaiuscula) {
                if(!temLetraMinuscula) {
                    if(temNumero) {
                        if(temCaractereEspecial) {
                            if(!temSequenciaComum) {
                                if(!temPalavraComum) {
                                    returnMessage = "Sua senha nao atende aos requisitos de seguranca."; }}}}}}}

        if (senha.length() >= comprimentoMinimo) {
            if (temLetraMaiuscula) {
                if(temLetraMinuscula) {
                    if(!temNumero) {
                        if(temCaractereEspecial) {
                            if(!temSequenciaComum) {
                                if(!temPalavraComum) {
                                    returnMessage = "Sua senha nao atende aos requisitos de seguranca."; }}}}}}}

        if (senha.length() >= comprimentoMinimo) {
            if (temLetraMaiuscula) {
                if(temLetraMinuscula) {
                    if(temNumero) {
                        if(!temCaractereEspecial) {
                            if(!temSequenciaComum) {
                                if(!temPalavraComum) {
                                    returnMessage = "Sua senha nao atende aos requisitos de seguranca."; }}}}}}}

        return returnMessage;
    }
}