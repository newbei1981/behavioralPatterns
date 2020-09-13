package com.newbie.behavioral.iterator;

public class Cities implements Collection{
    String countryName;
    String[] cities;

    public Cities(String countryName, String[] cities) {
        this.countryName = countryName;
        this.cities = cities;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String[] getCities() {
        return cities;
    }

    public void setCities(String[] cities) {
        this.cities = cities;
    }

    @Override
    public Iterator getIterator() {
        return new CitiesIterator();
    }

    private class CitiesIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if (index<cities.length) return true;
                else return false;
        }

        @Override
        public Object next() {
            return cities[index++];
        }
    }
}
