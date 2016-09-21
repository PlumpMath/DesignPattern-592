package HeadFirst.Proxy;

import java.lang.reflect.Proxy;

/**
 * @author NikoBelic
 * @create 9/21/16 13:45
 */
public class MatchMakingTestDrive
{
    static PersonBean getOwnerProxy(PersonBean person)
    {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }
    static PersonBean getNonOwnerProxy(PersonBean person)
    {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }
    public static void main(String[] args)
    {
        PersonBean Niko = new PersonBeanImpl("Niko","Male","Coding");
        PersonBean Tom = new PersonBeanImpl("Tom","Female","Eating");
        PersonBean ownerProxy = getOwnerProxy(Niko);
        System.out.println(Niko);
        ownerProxy.setInterests("Watching Movies.");
        try
        {
            ownerProxy.setHotOrNotRating(10);
        }catch (Exception e)
        {
            System.out.println("Can't set rating from owner proxy.");
        }
        System.out.println("=========== After Changes..============");
        System.out.println(Niko);

        System.out.println("=========== NonOwnerProxy =============");
        PersonBean nonOwnerProxy = getNonOwnerProxy(Tom);
        System.out.println(Tom);
        nonOwnerProxy.setHotOrNotRating(8);
        try
        {
            nonOwnerProxy.setInterests("Fucking.");
        }
        catch (Exception e)
        {
            System.out.println("Can't set private things to others.");
        }
        System.out.println(Tom);

        System.out.println("");
    }
}
