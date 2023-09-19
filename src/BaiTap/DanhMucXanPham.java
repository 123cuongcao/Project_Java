package BaiTap;

public class DanhMucXanPham {
    public static void main(String[] args) {
        Category category = new Category(1, "Điện thoại");

        Product product = new Product(101, "Samsung Galaxy S21", 999.99, category);

        product.display();
    }

    public static class Category {
        private int categoryId;
        private String categoryName;


        public Category() {
            // Khởi tạo các thuộc tính mặc định
            this.categoryId = 0;
            this.categoryName = "";
        }

        public Category(int categoryId, String categoryName) {
            this.categoryId = categoryId;
            this.categoryName = categoryName;
        }

        public void display() {
            System.out.println("Mã danh mục: " + categoryId);
            System.out.println("Tên danh mục: " + categoryName);
        }
    }

    public static class Product {
        private int productId;
        private String productName;
        private double productPrice;
        private Category category;

        public Product() {

            this.productId = 0;
            this.productName = "";
            this.productPrice = 0.0;
            this.category = new Category();
        }


        public Product(int productId, String productName, double productPrice, Category category) {
            this.productId = productId;
            this.productName = productName;
            this.productPrice = productPrice;
            this.category = category;
        }


        public void display() {
            System.out.println("Mã sản phẩm: " + productId);
            System.out.println("Tên sản phẩm: " + productName);
            System.out.println("Giá sản phẩm: " + productPrice);
            System.out.println("Danh mục sản phẩm:");
            category.display();
        }
    }
}
