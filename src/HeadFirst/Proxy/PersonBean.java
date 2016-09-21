package HeadFirst.Proxy;

/**
 * Created by NikoBelic on 9/21/16.
 */
public interface PersonBean
{
    String getName();
    String getGender();
    String getInterests();
    int getHotOrtNotRating();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);
}
