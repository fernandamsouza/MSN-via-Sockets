/**
 *
 */
package trabalhofinal;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 * A Classe Servidor vai utilizar o design pattern chamado de Singleton: Apenas
 * um Objeto desta classe vai existir na aplicacao.
 *
 * @author prof-valmor
 */
public class Servidor extends Thread {

    /**
     * Atributo para abrir o socket com a maquina remota.
     */
    private int porta;
    /**
     * Atributo para abrir o socket com a maquina remota.
     */
    private String ipAddress;
    /**
     * Socket aberto com a maquina remota.
     */
    private Socket maquinaRemota;
    /**
     * Este atributo se refere a unica instancia desta classe que vai existir.
     */
    private static Servidor instance;
    /**
     * Nome do usuario que vai se conectar na maquina remota. A maquina remota
     * espera esta informacao para poder adicionar na lista de usuarios.
     */
    private String nomeDoUsuario;
    /**
     * Objeto que vai ser chamado quando uma nova mensagem chegar.
     */
    private ObservadorDeMensagem observadorDeMensagem;

    /**
     * Construtor eh privado porque vai existir apenas um objeto do tipo
     * Servidor no Cliente. Isso vai ser garantido atraves do uso do metodo
     * getInstance().
     */
    private Servidor() {

    }

    /**
     * Esta eh a base do design pattern singleton, tratase de um metod static,
     * ou seja, eh um metodo da classe.
     *
     * Toda vez que for preciso acessar metodos do Servidor, vai-se utilizar o
     * getInstance.
     *
     * @return o objeto Servidor.
     */
    public static Servidor getInstance() {
        if (instance == null) {
            instance = new Servidor();
        }
        return instance;
    }

    /**
     * Metodo para conectar na maquina remota.
     *
     * @param nomeDoUsuario nome do usuario que vai conectar na maquina remota.
     * @param ip endereco IP da maquina remota.
     * @param porta porta aonde conectar.
     * @throws IOException se houver excessao, vai ser tratada por quem chamou o
     * metodo connect.
     */
    public void connect(String nomeDoUsuario, String ip, int porta) throws IOException {
        maquinaRemota = new Socket(ip, porta);
        this.nomeDoUsuario = nomeDoUsuario;
        // Envinado nome do usuario.
        OutputStream out = maquinaRemota.getOutputStream();
        PrintStream ps = new PrintStream(out);
        ps.println(nomeDoUsuario);
        //
        this.start();
    }

    public void setObservadorDeMensagem(ObservadorDeMensagem observador){
        this.observadorDeMensagem = observador;
    }

    /**
     * Servidor eh uma classe filha de Thread, vamos utilizar o metodo run()
     * para periodicamente ler dados da maquina remota.
     */
    public void run() {
        String mensagem = "";
        BufferedReader reader = null;
        //Criando o Data Input para ler a mensagem enviada pelo OCliente.
        try{
            InputStream inp = maquinaRemota.getInputStream();
            InputStreamReader iRead = new InputStreamReader(inp);
            reader = new BufferedReader(iRead);
        }catch(Exception e) {
            System.out.println("Erro criando BufferedReader..." + e.getMessage());
        }
        
        do {
            if(reader != null) {
                try{
                    mensagem = reader.readLine();
                    observadorDeMensagem.onMessageArrive(mensagem);
                }
                catch(IOException | NullPointerException x) {
                     System.out.println("Erro lendo mensagem..." + x.getMessage());
                }
            }
            
        } while (true);

    }

    void enviarMensagemPara(String usuario, String texto) throws IOException {
        OutputStream out = maquinaRemota.getOutputStream();
        PrintStream ps = new PrintStream(out);
        //
        String message = usuario + "-> " + texto;
        ps.println(message);
    }

}//fim da classe.
