public class Puppy {
    int puppyAge;

    public Puppy(String name) {
        // This constructor has one paramter, name.
        System.out.println("Passed Name is :" + name);
    }

    public void setAge( int age ) {
        puppyAge = age;
    }

    public int getAge ( ) {
        System.out.println("Puppy's age is :" + puppyAge );
        return puppyAge;
    }


    public static void main(String []args) {
        /* Object creation */
        Puppy myPuppy = new Puppy( "tommy" );

        /* Call class method to set puppy's age */
        myPuppy.setAge( 2 );

        /* Call another class method to get puppy's age */
        myPuppy.getAge( );

        /* */
        System.out.println("Variable Value :" + myPuppy.puppyAge );
    }
}
