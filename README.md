# Huong_Android3_Assigment1
Create three activitie, in MainActivity click button R, menu change to RedActivity, same click button B on MainActivity
1. Search for RelativeLayout in android with properties:
- android:layout_alignParentTop:cạnh trên của View trùng với cạnh trên của thành phần cha 
- android:layout_centerVertical:  Nếu “true”, View này sẽ được xếp vào giữa theo chiều dọc của thành phần cha.
- android:layout_below: View sẽ nằm dưới một view khác, và xác định view đó qua id.
- android:layout_toRightOf: View sẽ nẳm bên phải so với một View khác.

Bảng danh sách các thuộc tính canh phần tử xuất hiện như thế nào so với các phần tử khác được liệt kê phía sau:

- android:layout_above: Đặt phần tử hiện tại nằm kế sau phần tử có id được chỉ ra 

- android:layout_alignBaseline: Đặt phần tử này lên cùng dòng với phần tử có id được chỉ ra 

- android:layout_alignBottom:Canh sao cho đáy của phần tử hiện thời trùng với đáy của phần tử có id được chỉ ra

- android:layout_alignLeft: Đặt cạnh trái của phần tử hiện thời trùng với cạnh trái của phần tử có id được chỉ ra 

- android:layout_alignParentBottom: Nếu thiết lập là true thì phần tử hiện thời sẽ được canh xuống đáy của phần tử chứa nó 

- android:layout_alignParentLeft: Nếu được thiết lập là true thì phần tử hiện thời sẽ canh trái so với phần tử chứa nó 

- android:layout_alignParentRight: Nếu được thiết lập là true thì phần tử hiện thời sẽ canh phải so với phần tử chứa nó 

- android:layout_alignParentTop: Nếu được thiết lập là true thì phần tử hiện thời sẽ canh lên đỉnh phần tử chứa nó 

- android:layout_alignRight: Canh cạnh phải của phần tử hiện thời trùng với cạnh phải của phần tử có id được chỉ ra 

- android:layout_alignTop: Canh đỉnh của phần tử hiện thời trùng với đỉnh của phần tử có id được chỉ ra 

- android:layout_alignWithParentIfMissing: Nếu thiết lập là true, thì phần tử sẽ được canh theo phần tử chứa nó nếu các thuộc tính canh của phần tử không có.

- android:layout_below: Đặt phần tử hiện thời ngay sau phần tử có id được chỉ ra. 

- android:layout_centerHorizontal: Nếu thiết lập là true thì phần tử hiện thời sẽ được canh giữa theo chiều ngang phần tử chứa nó. 

- android:layout_centerInParent: Nếu thiết lập là true thì phần tử hiện thời sẽ được canh chính giữa theo chiều phải trái và trên dưới so với phần tử chứa nó. 

- android:layout_centerVertical: Nếu thiết lập là true thì phần tử hiện thời sẽ được canh chính giữa theo chiều dọc phần tử chứa nó.

- android:layout_toLeftOf: Đặt cạnh phải của phần tử hiện thời trùng với cạnh trái của phần tử có id được chỉ ra. 

- android:layout_toRightOf: Đặt cạnh trái của phần tử hiện thời trùng với cạnh phải của phần tử có id được chỉ ra. 


2. Intent and Bundle in android:
Thông thường thì bundle dùng để chuyển dữ liệu qua lại giữa các activity. 
Hiểu nôm na thì Bundle giống như kiện hàng bưu điện gồm có hàng và nhãn mác ghi thông tin bên ngoài.
cái này thực hiện thông qua các phương thức putxxx(key, data );
khi nhận thì ta gọi lại Bundle với phương thức getxxx(key);
- Intent (ý định) là những tin nhắn không đồng bộ cho phép các thành phần ứng dụng yêu cầu chức năng từ các thành phần Android khác. Intents cho phép bạn tương tác với các thành phần từ các ứng dụng như nhau cũng như với các thành phần đóng gói trong một ứng dụng khác. Ví dụ, một Activity có thể gọi một Activity bên ngoài để chụp ảnh. 
- Intent là đối tượng của class android.content.Intent. Mã của bạn có thể gửi Intent vào hệ thống Android với chỉ định thành phần mục tiêu gửi đến. 
Ví dụ thông qua phương thức startActivity(), bạn có thể định nghĩa một Intent sử dụng để gọi chạy một Activity khác. Tại Activity mục tiêu, thông qua phương thức startActivity() bạn có thể xác định được ý định của người gửi đến để bắt đầu (start) Activity này. 
Một Intent có thể chứa dữ liệu thông qua một Bundle. Dữ liệu này có thể được sử dụng bởi các thành phần tiếp nhận. 
Android hỗ trợ 2 loại Intent là Intent tường minh (explicit) và Intent không tường minh (implicit). 
*Ví du tạo Intent:
// Tạo một Intent với mục tiêu là GreetingActivity.
// Intent(FirstActivity, SecondActivity.class)
Intent intent = new Intent(this,GreetingActivity.class);
 
// Các dữ liệu gửi kèm
intent.putExtra("firstName",firstName);
intent.putExtra("lastName", lastName);
 
// Yêu cầu start Activity chỉ định trong Intent.
// (Không cần phản hồi từ Activity được gọi)
this.startActivity(intent);
 
 
// Yêu cầu start Activity và sẽ có phản hồi từ Activity được gọi.
this.startActivityForResult(intent, MY_REQUEST_CODE);

*hoặc
// Sử dụng Bundle cách 1.
Intent mIntent = new Intent(this, GreetingActivity.class);
Bundle extras = mIntent.getExtras();
extras.putString("firstName", "<firstName>");
extras.putString("látName", "<lastName>");
 
// Sử dụng Bundle cách 2.
Intent mIntent2 = new Intent(this, GreetingActivity.class);
Bundle mBundle = new Bundle();
mBundle.putString("firstName", "<firstName>");
mBundle.putString("látName", "<lastName>");
mIntent2.putExtras(mBundle);
 
// Cách 3:
// Sử dụng putExtra(), phương thức gọi tắt của Intent.
Intent mIntent3 = new Intent(this, GreetingActivity.class);
mIntent3.putExtra("firstName", "<firstName>");
mIntent3.putExtra("látName", "<lastName>");

*Tại Activity mục tiêu:
Intent intent = this.getIntent();
 
String firstName= intent.getStringExtra("firstName");
String lastName = intent.getStringExtra("lastName");
 
// Hoặc
Bundle extras = this.getIntent().getExtras();
 
String firstName1 = extras.getString("firstName");
String lastName2  = extras.getString("lastName");
