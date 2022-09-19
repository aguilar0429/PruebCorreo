
package hashtrial;


public class Correo {
    String usuarioCorreo,nombreArchivo,contrasena,rutaArchivo,destino,Asunto,mensaje;

    public Correo(String usuarioCorreo, String nombreArchivo, String contrasena, String rutaArchivo, String destino, String Asunto, String mensaje) {
        this.usuarioCorreo = usuarioCorreo;
        this.nombreArchivo = nombreArchivo;
        this.contrasena = contrasena;
        this.rutaArchivo = rutaArchivo;
        this.destino = destino;
        this.Asunto = Asunto;
        this.mensaje = mensaje;
    }

    Correo() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getUsuarioCorreo() {
        return usuarioCorreo;
    }

    public void setUsuarioCorreo(String usuarioCorreo) {
        this.usuarioCorreo = usuarioCorreo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String Asunto) {
        this.Asunto = Asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    
    
}
