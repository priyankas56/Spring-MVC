<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Form</title>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            font-family: 'Roboto', sans-serif;
            background-image: url('https://www.thedotstore.com/wp-content/uploads/sites/1417/2023/11/image-17.jpeg');
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            min-height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .container {
            background-color: rgba(255, 255, 255, 0.8); /* Semi-transparent white */
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 500px;
        }
        h2 {
            text-align: center;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Product Form</h2>
     <h3><span style="color:green">${message},${productDTO.name}</span></h3>
        <form action="product" method="post">
            <div class="mb-3">
                <label for="name" class="form-label">Full Name</label>
                <input type="text" id="name" class="form-control" name="name" placeholder="Enter your full name" value="${productDTO.name}" required>
            </div>
            <div class="mb-3">
                <label for="type" class="form-label">Product Type</label>
                <select id="type" class="form-control" name="type"  required>
                    <option value="" disabled selected>Select Product Type</option>
                    <option value="business product">Business Product</option>
                    <option value="consumer product">Consumer Product</option>
                    <option value="simple product">Simple Product</option>
                    <option value="bundle product">Bundle Product</option>
                    <option value="configurable product">Configurable Product</option>
                </select>
            </div>
            <div class="mb-3">
                <label for="cost" class="form-label">manufacture</label>
                <select id="cost" class="form-control" name="manufacture" value="${productDTO.name}" value="${productDTO.name}" required>
                    <option value="" disabled selected>Select manufacture</option>
                    <option value="batch">Batch</option>
                    <option value="discrete">Discrete</option>
                    <option value="repetitive">Repetitive</option>
                    <option value="continuous">Continuous</option>
                </select>
            </div>
            <div class="mb-3">
                            <label for="cost" class="form-label">cost</label>
                            <input type="text" id="cost" class="form-control" name="cost" value="${productDTO.cost}" required>
                        </div>
            <div class="mb-3">
                <label for="manfDate" class="form-label">Manufacturing Date</label>
                <input type="text" id="manfDate" class="form-control" name="manfDate"  value="${productDTO.manfDate}" required>
            </div>
            <div class="mb-3">
                <label for="warranty" class="form-label">Warranty (in years)</label>
                <input type="date" id="warranty" class="form-control" name="warranty" placeholder="Enter warranty period" value="${productDTO.warranty}" required>
            </div>
            <button type="submit" class="btn btn-primary w-100">Submit</button>
        </form>
    </div>
</body>
</html>