package pl.mateusz.siedlecki.programowanie1.JavaStart.InterfejsyComparableComparator;

public class Product implements Comparable<Product>{
    private String producer;
    private String name;
    private String category;

    public Product(String producer, String name, String category) {
        this.producer = producer;
        this.name = name;
        this.category = category;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return (this.category+", "+this.producer+", "+this.name);
    }

    @Override
    public int compareTo(Product o) {
        int categoryCompare = this.category.compareTo(o.getCategory());
        if (categoryCompare!=0){
            return categoryCompare;
        }
        int producerCompare = this.producer.compareTo(o.getProducer());
        if (producerCompare!=0){
            return producerCompare;
        }
        return this.name.compareTo(o.getName());
    }
}
