package klassen.annotations;

public class AnnotationA extends Annotation implements AnnotationC{
    @Override
    public void show(){
        System.out.println("AnnotationA");
    }

    @Deprecated
    public void shown(){

    }

}
