// Creacion de interfaz de Bienvenida de programa de empresa
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{


    // Componentes de Interfaz
    private JTextField textfield1;
    private JLabel label1,label2, label3, label4;
    private JButton boton1;
    public String texto = "";

    //Constuctor de interfaz
    public Bienvenida(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255,0,0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        
        ImageIcon imagen = new ImageIcon("images/logo-coca.png");
        label1 = new JLabel(imagen);
        // Dimension y coordenadas
        label1.setBounds(25,15,300,150);
        //Agregado de Etiqueta
        add(label1);

        //Dimension de texto de interfaz
        label2 = new JLabel("Sistema de Control Vacacional");
        label2.setBounds(35,135,300,30);
        //Fuente, dimension y tipo de tipografia de interfaz
        label2.setFont(new Font("Andale Mono", 3, 18));
        //Agregado de color de texto
        label2.setForeground(new Color(255,255,255));
        //Agregado de etiqueta
        add(label2);

        //Dimension de texto de interfaz
        label3 = new JLabel("Ingrese su nombre");
        label3.setBounds(45,212,200,30);
        //Fuente, dimension y tipo de tipografia de interfaz
        label3.setFont(new Font("Andale Mono", 1, 12));
        //Agregado de color de texto
        label3.setForeground(new Color(255,255,255));
        //Agregado de etiqueta
        add(label3);

        //Dimension de texto de interfaz
        label4 = new JLabel("©2021 The Coca-Cola Company");
        label4.setBounds(85,375,300,30);
        //Fuente, dimension y tipo de tipografia de interfaz
        label4.setFont(new Font("Andale Mono", 3, 10));
        //Agregado de color de texto
        label4.setForeground(new Color(255,255,255));
        //Agregado de etiqueta
        add(label4);

        // Componente de Texto
        textfield1 = new JTextField();
        // Dimensiones y coordendas de fondo de texto
        textfield1.setBounds(45,240,255,25);
        textfield1.setBackground(new Color(224,224,224));
        textfield1.setFont(new Font("Andale Mono", 1, 14));
        textfield1.setForeground(new Color(225,0,0));
        add(textfield1);

        //Componente de boton
        boton1 = new JButton("Ingresar");
        boton1.setBounds(125,280,100,30);
        //Fuente, dimension y tipo de tipografia de interfaz
        boton1.setFont(new Font("Andale Mono", 1,14));
        boton1.setBackground(new Color(225,225,225));
        //Agregado de color de texto
        boton1.setForeground(new Color(255,0,0));
        // Evento de Accion de Boton
        boton1.addActionListener(this);
        //Agregado de etiqueta
        add(boton1);
    }
    
    // Evento de Accion de boton
    public void actionPerformed(ActionEvent e){
        //Estructura condicional if
        if(e.getSource() == boton1){
            //Metodo recuperacion con metodo Trim borra espacios 
          texto = textfield1.getText().trim();
          if(texto.equals("")){
              JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre.");              
          } else {
            // Dise;o de interfaz
            Licencia ventanalicencia = new Licencia();
            // Dimension de interfaz
            ventanalicencia.setBounds(0,0,600,360);
            // Visibilidad de Interfaz
            ventanalicencia.setVisible(true);
            // Permiso de Usuario
            ventanalicencia.setResizable(false);
            // Centrado de Interfaz
            ventanalicencia.setLocationRelativeTo(null);
            //Motodo voleano de apagado de ocultacion de interfaz
            this.setVisible(false);
          }
        }
    }

    //Dise;o de Interfaz
    public static void main(String args[]){
        Bienvenida ventanabienvenida = new Bienvenida();
        //Dimensiones de intefaz
        ventanabienvenida.setBounds(0,0,350,450);
        //Visibildad de Intefaz
        ventanabienvenida.setVisible(true);
        //Permisos de usuario
        ventanabienvenida.setResizable(false);
        //Centrado de Interfaz
        ventanabienvenida.setLocationRelativeTo(null);
    }
}