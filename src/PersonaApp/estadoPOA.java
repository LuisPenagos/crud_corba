package PersonaApp;


/**
* PersonaApp/estadoPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from persona.idl
* domingo 27 de mayo de 2018 06:22:43 PM COT
*/

public abstract class estadoPOA extends org.omg.PortableServer.Servant
 implements PersonaApp.estadoOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarEstado", new java.lang.Integer (0));
    _methods.put ("consultarEstado", new java.lang.Integer (1));
    _methods.put ("eliminarEstado", new java.lang.Integer (2));
    _methods.put ("actualizarEstado", new java.lang.Integer (3));
    _methods.put ("listarEstado", new java.lang.Integer (4));
    _methods.put ("shutdawn", new java.lang.Integer (5));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // PersonaApp/estado/insertarEstado
       {
         int id = in.read_long ();
         String nombre = in.read_wstring ();
         boolean $result = false;
         $result = this.insertarEstado (id, nombre);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // PersonaApp/estado/consultarEstado
       {
         int id = in.read_long ();
         String $result = null;
         $result = this.consultarEstado (id);
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 2:  // PersonaApp/estado/eliminarEstado
       {
         int nombre = in.read_long ();
         boolean $result = false;
         $result = this.eliminarEstado (nombre);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // PersonaApp/estado/actualizarEstado
       {
         int id = in.read_long ();
         String nombre = in.read_wstring ();
         boolean $result = false;
         $result = this.actualizarEstado (id, nombre);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 4:  // PersonaApp/estado/listarEstado
       {
         String $result = null;
         $result = this.listarEstado ();
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 5:  // PersonaApp/estado/shutdawn
       {
         this.shutdawn ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:PersonaApp/estado:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public estado _this() 
  {
    return estadoHelper.narrow(
    super._this_object());
  }

  public estado _this(org.omg.CORBA.ORB orb) 
  {
    return estadoHelper.narrow(
    super._this_object(orb));
  }


} // class estadoPOA
