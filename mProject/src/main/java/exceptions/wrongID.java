package exceptions;

import java.util.InputMismatchException;

public class wrongID extends InputMismatchException
{
    public wrongID()
    {
        super("duplicate id !");
    }

    @Override
    public String toString() {
        return "someone else has already chosen this id .";
    }
}
