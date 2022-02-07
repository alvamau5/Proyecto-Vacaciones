// Creacion de terminos y condiciones para programa
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

// Constructor de clase
public class Licencia extends JFrame implements ActionListener, ChangeListener{

    // Constructores
    private JLabel label1, label2;
    private JCheckBox check1;
    private JButton boton1, boton2;
    private JScrollPane scrollpane1;
    private JTextArea textarea1;
    String nombre = "";

    // Creacion de constructor
    public Licencia(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Lincencia de uso");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        Bienvenida ventanaBienvenida  = new Bienvenida();
        nombre = ventanaBienvenida.texto;

        //Creacion de Etiquetas
        label1 = new JLabel("TERMINOS Y CONDICIONES");
        //Coordenadas y dimensiones de Etiqueta
        label1.setBounds(215,5,200,30);
        // Tipo de fuenete y tama;o
        label1.setFont(new Font("Andale Mono", 1, 14));
        // Color de fondo de fuente
        label1.setForeground(new Color (0, 0, 0));
        add(label1);

        // Componente TextArea
        textarea1 = new JTextArea();
        // Marcador si es editable el contenido dentro del JTextarea
        textarea1.setEditable(false);
        //Tipo de fuente y tama;o
        textarea1.setFont(new Font("Andale Mono", 1, 8));
        textarea1.setText("\n\n          TERMINOS Y CONDICIONES" +
        "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCION SIN AUTORIZACION DE LA GEEKIPEDIA DE ERNESTO." +
        "\n            B.  PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISEÑO DE LAS INTERFACES GRAFICAS." +
        "\n            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
        "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACION RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
        "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED" + 
        "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
        "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
        "\n\n          PARA MAYOR INFORMACION SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" + 
        "\n          http://www.youtube.com/ernestoperez");
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(10,40,575,200);
        add(scrollpane1);        

        // Componente Checkbox//
        check1 = new JCheckBox("Yo " + ventanaBienvenida.texto + " Acepto"); 
        // Dimensiones y coordenadas de componente
        check1.setBounds(10,250,300,30);
        // Llamado de evento 
        check1.addChangeListener(this);
        // Agredado a etiqueta
        add(check1); 

        // Componente Boton
        boton1 = new JButton("Continuar");
        // Dimensiones y coordenadas 
        boton1.setBounds(10,290,100,30);
        // Llamado de evento
        boton1.addActionListener(this);
        // Metodo voleano para activacion de boton
        boton1.setEnabled(false);
        // Agregado a etiqueta
        add(boton1);
        

        // Componente Boton
        boton2 = new JButton("No Acepto");
        // Dimensiones y coordenadas 
        boton2.setBounds(120,290,100,30);
        // Llamado de evento
        boton2.addActionListener(this);
        // Metodo voleano para activacion de boton
        boton2.setEnabled(true);
        // Agregado a etiqueta
        add(boton2);

        // Contension de imagen en etiquet de interfaz
        ImageIcon imagen = new ImageIcon("images/coca-cola.png");
        label2 = new JLabel(imagen);
        label2.setBounds(315,135,300,300);
        add(label2);
    }

    // Llamado de evento de Change
    public void stateChanged(ChangeEvent e){
        if(check1.isSelected() == true){
            boton1.setEnabled(true);
            boton2.setEnabled(false); 
        } else {
            boton1.setEnabled(false);
            boton2.setEnabled(true);
        }
    }

    // Llamado de evento de Action
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            Principal ventanaPrincipal = new Principal();
            //Dimensiones de intefaz
            ventanaPrincipal.setBounds(0,0,640,535);
            //Visibildad de Intefaz
            ventanaPrincipal.setVisible(true);
            //Permisos de usuario
            ventanaPrincipal.setResizable(false);
            //Centrado de Interfaz
            ventanaPrincipal.setLocationRelativeTo(null);
            //Motodo voleano de apagado de ocultacion de interfaz
            this.setVisible(false);
        } else if(e.getSource() == boton2){
            Bienvenida ventanabienvenida = new Bienvenida();
           //Dimensiones de intefaz
           ventanabienvenida.setBounds(0,0,350,450);
           //Visibildad de Intefaz
           ventanabienvenida.setVisible(true);
           //Permisos de usuario
           ventanabienvenida.setResizable(false);
           //Centrado de Interfaz
           ventanabienvenida.setLocationRelativeTo(null);
           //Motodo voleano de apagado de ocultacion de interfaz
           this.setVisible(false);
        }
    }
    
    // Dise;o de interfaz
    public static void main(String args[]){
        Licencia ventanalicencia = new Licencia();
        // Dimension de interfaz
        ventanalicencia.setBounds(0,0,600,360);
        // Visibilidad de Interfaz
        ventanalicencia.setVisible(true);
        // Permiso de Usuario
        ventanalicencia.setResizable(false);
        // Centrado de Interfaz
        ventanalicencia.setLocationRelativeTo(null);
    }
}