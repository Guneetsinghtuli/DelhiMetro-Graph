package org.guneetsingh;

import com.diogonunes.jcolor.Attribute;

import java.util.*;

import static com.diogonunes.jcolor.Ansi.colorize;
import static org.guneetsingh.Constants.getColor;


public class Graph {
  HashMap<MetroStation, HashMap<MetroStation,Integer>> map = new HashMap<>();


  Graph(){
//    addAllIntersection();
    addBlueLine();
    addRedLine();
    addYellowLine();
    addVioletLine();
    addPinkLine();
    addGreenLine();
    addOrangeLine();
    addMagentaLine();
    addRapidLine();
    addGreyLine();
    addAquaLine();
  }


  void addAllIntersection(){
    List<String> intersections = Arrays.asList(
        "Kashmere Gate", "Rajiv Chowk", "Central Secretariat", "New Delhi", "Inderlok", "Ashok Park Main",
        "Mandi House","Yamuna Bank","Botanical Garden","Mayur Vihar Phase 1","Karkarduma","Anand Vihar",
        "Welcome","Netaji Subhash Place","Lajpat Nagar","Kalkaji Mandir","Rajouri Garden","Janakpuri West",
        "Punjabi Bagh West","Dwarka"
    );

    for (String str: intersections) {
      MetroStation ms = new MetroStation(str,"White");
      map.put(ms,new HashMap<>());
    }
  }


  private void addBlueLine1(){
    List<String> stations = Arrays.asList(
        "Noida Electronic City", "Noida Sector 62", "Noida Sector 59", "Noida Sector 61","Noida Sector 52","Noida Sector 34",
        "Noida City Center", "Golf Course", "Botanical Garden", "Noida Sector 18", "Noida Sector 16", "Noida Sector 15",
        "New Ashok Nagar", "Mayur Vihar Extension", "Mayur Vihar Phase 1", "Akshardham", "Yamuna Bank"
    );
    for (String str: stations) {
      MetroStation ms = new MetroStation(str,"Blue");
      if(!map.containsKey(ms)){
        map.put(ms,new HashMap<>());
      }
    }

    for (int i = 0; i < stations.size() - 1; i++) {
      MetroStation a1 = new MetroStation(stations.get(i),"Blue");
      MetroStation a2 = new MetroStation(stations.get(i+1),"Blue");
      addWeights(a1, a2);
    }
  }

  private void addBlueLine(){
    List<String> stations = Arrays.asList(
        "Dwarka Sec 21", "Dwarka Sec 8", "Dwarka Sec 9", "Dwarka Sec 10", "Dwarka Sec 11", "Dwarka Sec 12",
        "Dwarka Sec 13", "Dwarka Sec 14", "Dwarka", "Dwarka Mor", "Nawada", "Uttam Nagar West", "Uttam Nagar East",
        "Janakpuri West", "Janakpuri East", "Tilak Nagar", "Subhash Nagar", "Tagore Garden", "Rajouri Garden",
        "Ramesh Nagar", "Moti Nagar", "Kirti Nagar", "Shadipur", "Patel Nagar", "Rajendra Place", "Karol Bagh",
        "Jhandewalan", "R K Ashram Marg", "Rajiv Chowk", "Barakhamba Road", "Mandi House","Supreme Court",
        "Indraprastha", "Yamuna Bank", "Laxmi Nagar", "Nirman Vihar", "Preet Vihar", "Karkardooma", "Anand Vihar",
        "Kaushambi", "Vaishali"

    );
    // Creating metro stations
    for (String str: stations) {
      MetroStation metroStation = new MetroStation(str,"Blue");
      if(!map.containsKey(metroStation)){
        map.put(metroStation,new HashMap<>());
      }
    }

    for (int i = 0; i < stations.size() - 1; i++) {
      MetroStation a1 = new MetroStation(stations.get(i),"Blue");
      MetroStation a2 = new MetroStation(stations.get(i+1),"Blue");
      addWeights(a1, a2);
    }
    addBlueLine1();

  }

  private void addRedLine(){
    List<String> stations = Arrays.asList(
        "Rithala", "Rohini West", "Rohini East", "Pitampura", "Kohat Enclave", "Netaji Subhash Place",
        "Keshav Puram", "Kanhaiya Nagar", "Inderlok", "Shastri Nagar", "Pratap Nagar", "Pulbangash",
        "Tis Hazari", "Kashmere Gate", "Shastri Park", "SeelamPur", "Welcome", "Shahdara", "Mansarovar Park",
        "Jhilmil", "Dilshad Garden","Shaheed Nagar","Raj Bagh","Rajendra Nagar","Shyam Park","Mohan Nagar","Arthala","Shaheed Sthal"
    );
    for (String str: stations) {
      MetroStation metroStation = new MetroStation(str,"Red");
      if(!map.containsKey(metroStation)){
        map.put(metroStation,new HashMap<>());
      }
    }


    for (int i = 0; i < stations.size() - 1; i++) {
      MetroStation a1 = new MetroStation(stations.get(i),"Red");
      MetroStation a2 = new MetroStation(stations.get(i+1),"Red");
      addWeights(a1, a2);
    }

  }

  private void addYellowLine(){
    List<String> yellowLineStations = Arrays.asList(
        "Samaypur Badli", "Rohini Sector 18-19", "Haiderpur Badli Mor",
        "Jahangirpuri", "Adarsh Nagar", "Azadpur", "Model Town", "G.T.B. Nagar",
        "Vishwa Vidyalaya", "Vidhan Sabha", "Civil Lines", "Kashmere Gate",
        "Chandni Chowk", "Chawri Bazar", "New Delhi", "Rajiv Chowk", "Patel Chowk",
        "Central Secretariat", "Udyog Bhawan", "Race Course", "Jor Bagh", "INA",
        "AIIMS", "Green Park", "Hauz Khas", "Malviya Nagar", "Saket", "Qutub Minar",
        "Chhatarpur", "Sultanpur", "Ghitorni", "Arjangarh", "Guru Dronacharya",
        "Sikanderpur", "M.G. Road", "IFFCO Chowk", "Gurugram"
    );
    for (String str: yellowLineStations) {
      MetroStation metroStation = new MetroStation(str,"Yellow");
      if(!map.containsKey(metroStation)){
        map.put(metroStation,new HashMap<>());
      }
    }

    for (int i = 0; i < yellowLineStations.size() - 1; i++) {
      MetroStation a1 = new MetroStation(yellowLineStations.get(i),"Yellow");
      MetroStation a2 = new MetroStation(yellowLineStations.get(i+1),"Yellow");
      addWeights(a1, a2);
    }

  }

  private void addVioletLine(){
    List<String> violetLineStations = Arrays.asList(
        "Kashmere Gate", "Lal Quila", "Jama Masjid", "Delhi Gate", "ITO", "Mandi House",
        "Janpath", "Central Secretariat", "Khan Market", "Jawaharlal Nehru Stadium",
        "Jangpura", "Lajpat Nagar", "Moolchand", "Kailash Colony", "Nehru Place",
        "Kalkaji Mandir", "Govind Puri", "Okhla", "Jasola", "Sarita Vihar", "Mohan Estate",
        "Tughlakabad", "Badarpur", "Sarai", "N.H.P.C. Chowk", "Mewala Maharajpur",
        "Sector 28", "Badkal Mor", "Old Faridabad", "Neelam Chowk Ajronda", "Bata Chowk",
        "Escorts Mujesar", "Sant Surdas (Sihi)", "Raja Nahar Singh (Ballabhgarh)"
    );
    for (String str: violetLineStations) {
      MetroStation metroStation = new MetroStation(str,"Violet");
      if(!map.containsKey(metroStation)){
        map.put(metroStation,new HashMap<>());
      }
    }

    for (int i = 0; i < violetLineStations.size() - 1; i++) {
      MetroStation a1 = new MetroStation(violetLineStations.get(i),"Violet");
      MetroStation a2 = new MetroStation(violetLineStations.get(i+1),"Violet");
      addWeights(a1, a2);
    }


  }

  private void addPinkLine(){
    List<String> pinkLineStations = Arrays.asList(
        "Majlis Park", "Azadpur", "Shalimar Bagh", "Netaji Subhash Place", "Shakurpur",
        "Punjabi Bagh West", "ESI Hospital", "Rajouri Garden", "Maya Puri", "Naraina Vihar",
        "Delhi Cantt", "Durgabai Deshmukh South Campus", "Sir Vishveshwaraiah Moti Bagh",
        "Bhikaji Cama Place", "Sarojini Nagar", "Delhi Haat INA", "South Extension", "Lajpat Nagar",
        "Vinobapuri", "Ashram", "Sarai Kale Khan Nizamuddin", "Mayur Vihar Phase-1", "Mayur Vihar Pocket-1",
        "Trilokpuri Sanjay Lake", "East Vinod Nagar", "West Vinod Nagar", "IP Extension", "Anand Vihar",
        "Karkarduma", "Karkarduma Court", "Krishna Nagar", "East Azad Nagar", "Welcome",
        "Jaffrabad", "Maujpur", "Gokulpuri", "Johri Enclave", "Shiv Vihar"
    );
    for (String str: pinkLineStations) {
      MetroStation metroStation = new MetroStation(str,"Pink");
      if(!map.containsKey(metroStation)){
        map.put(metroStation,new HashMap<>());
      }
    }

    for (int i = 0; i < pinkLineStations.size() - 1; i++) {
        MetroStation a1 = new MetroStation(pinkLineStations.get(i),"Pink");
        MetroStation a2 = new MetroStation(pinkLineStations.get(i+1),"Pink");
        addWeights(a1, a2);
    }
  }

  private void addOrangeLine(){
    List<String> orangeLineStations = Arrays.asList(
        "New Delhi", "Shivaji Stadium", "Dhaula Kuan", "Delhi Aerocity", "IGI Airport",
        "Dwarka Sector 21"
    );
    for (String str: orangeLineStations) {
      MetroStation metroStation = new MetroStation(str,"Orange");
      if(!map.containsKey(metroStation)){
        map.put(metroStation,new HashMap<>());
      }
    }

    for (int i = 0; i < orangeLineStations.size() - 1; i++) {
      MetroStation a1 = new MetroStation(orangeLineStations.get(i),"Orange");
      MetroStation a2 = new MetroStation(orangeLineStations.get(i+1),"Orange");
      addWeights(a1, a2);
    }
  }

  private void addGreenLine(){
    List<String> greenLineStations = Arrays.asList(
        "Brig. Hoshiar Singh", "Bahadurgarh City", "Pandit Shree Ram Sharma", "Tikri Border",
        "Tikri Kalan", "Ghevra Metro Station", "Mundka Industrial Area", "Mundka", "Rajdhani Park",
        "Nangloi Railway Station", "Nangloi", "Surajmal Stadium", "Udyog Nagar",
        "Peera Garhi", "Paschim Vihar West", "Paschim Vihar East", "Madi Pur", "Shivaji Park",
        "Punjabi Bagh West","Punjabi Bagh West", "Ashok Park Main", "Satguru Ram Singh Marg", "Kirti Nagar"
    );

    for (String str: greenLineStations) {
      MetroStation metroStation = new MetroStation(str,"Green");
      if(!map.containsKey(metroStation)){
        map.put(metroStation,new HashMap<>());
      }
    }
    // Todo: Add weights
//    addWeights("Inderlok","Ashok Park Main");
    for (int i = 0; i < greenLineStations.size() - 1; i++) {
      MetroStation a1 = new MetroStation(greenLineStations.get(i),"Green");
      MetroStation a2 = new MetroStation(greenLineStations.get(i+1),"Green");
      addWeights(a1, a2);
    }

  }

  private void addMagentaLine(){
    List<String> magentaLineStations = Arrays.asList(
        "Botanical Garden", "Okhla Bird Sanctuary", "Kalindi Kunj", "Jasola Vihar Shaheen Bagh",
        "Okhla Vihar", "Jamia Millia Islamia", "Sukhdev Vihar", "Okhla NSIC", "Kalkaji Mandir",
        "Nehru Enclave", "Greater Kailash", "Chirag Delhi", "Panchsheel Park",
        "Hauz Khas", "IIT Delhi", "R.K Puram", "Munirka", "Vasant Vihar", "Shankar Vihar",
        "Terminal 1 IGI Airport", "Sadar Bazar Cantonment", "Palam", "Dashrathpuri", "Dabri Mor",
        "Janakpuri West"

    );

    for (String str: magentaLineStations) {
        MetroStation metroStation = new MetroStation(str,"Magenta");
      if(!map.containsKey(metroStation)){
        map.put(metroStation,new HashMap<>());
      }
    }

    for (int i = 0; i < magentaLineStations.size() - 1; i++) {
      MetroStation a1 = new MetroStation(magentaLineStations.get(i),"Magenta");
      MetroStation a2 = new MetroStation(magentaLineStations.get(i+1),"Magenta");
      addWeights(a1, a2);
    }

  }

  private void addRapidLine(){
    List<String> rapidLineStations = Arrays.asList(
        "Sector 55-56", "Sector 54 Chowk", "Sector 53-54", "Sector 42-43", "Phase 1", "Sikanderpur",
        "DLF Phase 2", "Belvedere Towers", "Cyber City", "Moulsari Avenue", "DLF Phase 3"
    );

    for (String str: rapidLineStations) {
        MetroStation metroStation = new MetroStation(str,"Rapid");
      if(!map.containsKey(metroStation)){
        map.put(metroStation,new HashMap<>());
      }
    }
// Todo
//    addWeights("DLF Phase 3","DLF Phase 2");
    for (int i = 0; i < rapidLineStations.size() - 1; i++) {
      MetroStation a1 = new MetroStation(rapidLineStations.get(i),"Rapid");
      MetroStation a2 = new MetroStation(rapidLineStations.get(i+1),"Rapid");
      addWeights(a1, a2);
    }

  }


  private void addGreyLine(){
    List<String> greyLineStations = Arrays.asList(
        "Dwarka", "Nangli", "Najafgarh", "Dhansa Bus Stand"
    );

    for (String str: greyLineStations) {
        MetroStation metroStation = new MetroStation(str,"Grey");
      if(!map.containsKey(metroStation)){
        map.put(metroStation,new HashMap<>());
      }
    }

    for (int i = 0; i < greyLineStations.size() - 1; i++) {
      MetroStation a1 = new MetroStation(greyLineStations.get(i),"Grey");
      MetroStation a2 = new MetroStation(greyLineStations.get(i+1),"Grey");
      addWeights(a1, a2);
    }

  }

  private void addAquaLine(){

    List<String> aquaLineStation= Arrays.asList(
        "Sector 51", "Sector 50", "Sector 76", "Sector 101", "Sector 81", "NSEZ",
        "Sector 83", "Sector 137", "Sector 142", "Sector 143", "Sector 144", "Sector 145",
        "Sector 146", "Sector 147", "Sector 148", "Knowledge Park II", "Pari Chowk",
        "Alpha 1", "Delta 1", "GNIDA Office", "Depot Station"
    );

    for (String str: aquaLineStation) {
        MetroStation metroStation = new MetroStation(str,"Aqua");
      if(!map.containsKey(metroStation)){
        map.put(metroStation,new HashMap<>());
      }
    }


    for (int i = 0; i < aquaLineStation.size() - 1; i++) {
      MetroStation a1 = new MetroStation(aquaLineStation.get(i),"Aqua");
      MetroStation a2 = new MetroStation(aquaLineStation.get(i+1),"Aqua");
      addWeights(a1, a2);
    }
    MetroStation source = new MetroStation("Noida Sector 52","Blue");
    MetroStation destination = new MetroStation("Sector 51","Aqua");
    addWeights(source,destination);
  }


  void getMeHere(String source,String destination){
    MetroStation source1 = new MetroStation(source,"White");
    MetroStation destination1 = new MetroStation(destination,"White");
    DijkstraAlgo(source1,destination1);
  }





  private void addWeights(MetroStation v1,MetroStation v2){
    map.get(v1).put(v2,1);
    map.get(v2).put(v1,1);
  }


  void DijkstraAlgo(MetroStation source){

    PriorityQueue<MetroPair> pq = new PriorityQueue<>(new Comparator<MetroPair>() {
      @Override
      public int compare(MetroPair o1, MetroPair o2) {
        return o1.cost-o2.cost;
      }
    });
    HashSet<MetroStation> set = new HashSet<>();
    pq.add(new MetroPair(source,new ArrayList<>(Arrays.asList(source)),0));
    while(!pq.isEmpty()){
      MetroPair pair = pq.poll();
      if(set.contains(pair.vertex)){
        continue;
      }
      set.add(pair.vertex);
      System.out.println(pair);
      for (MetroStation str: map.get(pair.vertex).keySet()) {
        if(!set.contains(str)){
          int cost=map.get(pair.vertex).get(str)+pair.cost;
          List<MetroStation> combinedList = new ArrayList<>(pair.path);
          combinedList.add(str);
          pq.add(new MetroPair(str,combinedList,cost));
        }
      }
    }
  }

  void printRoute(List<MetroStation> arr) {
    System.out.println(colorize("You are standing at "+arr.get(0) + " Metro Station",Attribute.BLACK_TEXT(),Attribute.WHITE_BACK(),Attribute.BOLD()));
    System.out.println(colorize("You have to travel "+(arr.size()-1)+" stations",Attribute.BLACK_TEXT(),Attribute.BLUE_BACK(),Attribute.BOLD()));
    System.out.println();
    try {
      for (MetroStation each : arr) {
        Attribute at = getColor(each.getColor());
        System.out.println(colorize(each.toString(),at));
      }
    }catch (Exception e){
      System.out.println(e.getMessage());
    }

  }



  void DijkstraAlgo(MetroStation source,MetroStation destination){
    source = new MetroStation(source.getName(),map.get(source).keySet().iterator().next().getColor());
    PriorityQueue<MetroPair> pq = new PriorityQueue<>(new Comparator<MetroPair>() {
      @Override
      public int compare(MetroPair o1, MetroPair o2) {
        return o1.cost-o2.cost;
      }
    });
    HashSet<MetroStation> set = new HashSet<>();
    pq.add(new MetroPair(source,new ArrayList<>(Arrays.asList(source)),0));
    while(!pq.isEmpty()){
      MetroPair pair = pq.poll();
      if(set.contains(pair.vertex)){
        continue;
      }
      set.add(pair.vertex);
      if(pair.vertex.equals(destination)){
        printRoute(pair.path);
      }
      for (MetroStation str: map.get(pair.vertex).keySet()) {
        MetroStation ms = new MetroStation(str.getName(),str.getColor());
        if(!set.contains(str)){
          int cost=map.get(pair.vertex).get(str)+pair.cost;
          List<MetroStation> combinedList = new ArrayList<>(pair.path);
          combinedList.add(str);
          pq.add(new MetroPair(str,combinedList,cost));
        }

      }
    }

  }


  @Override
  public String toString() {
    return "Graph{" +
        "map=" + map +
        '}';
  }
}




class MetroPair{
  MetroStation vertex;
  List<MetroStation> path;
  int cost;

  public MetroPair(MetroStation vertex, List<MetroStation> path, int cost) {
    this.vertex = vertex;
    this.path = path;
    this.cost = cost;
  }

  @Override
  public String toString() {
    return this.vertex + " " + this.path +"@ No of Station:"+this.cost;
  }
}




