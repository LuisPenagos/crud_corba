package PersonaApp;

/**
* PersonaApp/generoHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from persona.idl
* domingo 27 de mayo de 2018 06:22:43 PM COT
*/

public final class generoHolder implements org.omg.CORBA.portable.Streamable
{
  public PersonaApp.genero value = null;

  public generoHolder ()
  {
  }

  public generoHolder (PersonaApp.genero initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = PersonaApp.generoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    PersonaApp.generoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return PersonaApp.generoHelper.type ();
  }

}
