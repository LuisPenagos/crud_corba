package PersonaApp;


/**
* PersonaApp/estadoHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from persona.idl
* domingo 27 de mayo de 2018 06:22:43 PM COT
*/

abstract public class estadoHelper
{
  private static String  _id = "IDL:PersonaApp/estado:1.0";

  public static void insert (org.omg.CORBA.Any a, PersonaApp.estado that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static PersonaApp.estado extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (PersonaApp.estadoHelper.id (), "estado");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static PersonaApp.estado read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_estadoStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, PersonaApp.estado value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static PersonaApp.estado narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof PersonaApp.estado)
      return (PersonaApp.estado)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      PersonaApp._estadoStub stub = new PersonaApp._estadoStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static PersonaApp.estado unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof PersonaApp.estado)
      return (PersonaApp.estado)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      PersonaApp._estadoStub stub = new PersonaApp._estadoStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}