package oopproject;
abstract class person{
    String name;
    char gender;
    String dob;
    long contact;
    String email;
    String country;
    String city;
    static String pasw;
    String religion;
        //Constructer use
        public person(){
        setName(name);
        setGender(gender);
        setDob(dob);
        setContact(contact);        
        setEmail(email);
        setCountry(country);
        setCity(city);
        setpasw(pasw);
        setReligion(religion);
    }
        //seter and geter use
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setGender(char gender){
        this.gender=gender;
    }
    public char getGender(){
        return gender;
    }
    public void setDob(String dob){
        this.dob=dob;         
    }
    public String getDob(){
        return dob;
    }
    public void setContact(long contact){
        this.contact=contact;
    }
    public long getContact(){
        return contact;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    public void setCountry(String country){
        this.country=country;
    }
    public String getCountry(){
        return country;
    }
    public void setCity(String city){
        this.city=city;
    }
    public String getCity(){
        return city;
    }
    public void setpasw(String pasw){
        this.pasw=pasw;
    }
    public String getpasw(){
        return pasw;
    }
    public void setReligion(String religion){
        this.religion=religion;
    }
    public String getReligion(){
        return religion;
    }
}
