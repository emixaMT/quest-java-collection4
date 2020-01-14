public class Thanos {

    public static void main(String[] args) {

        Hero hulk = new Hero("Hulk", 49);
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero thor = new Hero("Thor", 1501);
        Hero vision = new Hero("Vision", 3);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero doctorStrange = new Hero("Doctor Strange", 42);
        
        Flower lily = new Flower("Lily");
        Flower tulip = new Flower("Tulip");
        Flower begonia = new Flower("Begonia");
        Flower violet = new Flower("Violet");
        Flower rose = new Flower("Rose");

        Comparator<Hero> comparator = new Comparator<Hero>(){
            @Override
            public int compare(Hero hero0, Hero hero1) {
                return  hero0.getName().compareTo(hero1.getName());
            }
        };


        Map<Hero, Flower> party = new TreeMap<>(comparator);
        party.put(hulk, rose);
        party.put(thor, rose);
        party.put(scarletWitch, rose);
        party.put(vision, tulip);
        party.put(captainAmerica, lily);
        party.put(doctorStrange, violet);
        party.put(blackWidow, violet);

        System.out.println(party.containsValue(begonia));

        for (Hero hero : party.keySet()) {
            Flower flower = party.get(hero);
            System.out.println(flower.getName());
        }


    }
}
