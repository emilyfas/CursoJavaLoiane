package com.loiane.cursojava.aula36;

public class TesteCont {
    public static void main(String[] args) {

        Contato cont = new Contato();
        cont.setNome("Emilly");

        Endereco end = new Endereco();
        end.setNomeRua("Rua dos tolos");
        end.setNumero("65");
        end.setComplemento("Nenhum");
        end.setCidade("Belo Horizonte");
        end.setEstado("Minas Gerais");
        end.setCep("65465444");

        cont.setEndereco(end);

        Telefone tel1 = new Telefone();
        tel1.setTipo("celular");
        tel1.setDdd("31");
        tel1.setNumero("95466-5465");

        Telefone tel2 = new Telefone();
        tel2.setTipo("fixo");
        tel2.setDdd("31");
        tel2.setNumero("9999-9999");

        Telefone[] telefones = {tel1, tel2};

        cont.setTelefones(telefones);

        System.out.println(cont.getNome());

        // checando se Endereco não é nulo
        if (cont != null && cont.getEndereco() != null) {
            System.out.println(cont.getEndereco().getNomeRua());
        }

        if(cont != null && cont.getTelefones() != null){
            for (Telefone t : cont.getTelefones()) {
                System.out.println(t.getDdd() +" "+ t.getNumero());
            }
        }
    }
}
