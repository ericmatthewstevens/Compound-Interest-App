<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Tomcat Compound Interest Calculator</title>

    <link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">
</head>
<body class="bg-blue-500">
    <div class="bg-white mx-auto text-center w-1/2 py-5 shadow-xl rounded-3xl my-96 max-w-2xl">
        <h2 class="text-4xl font-semibold border-b pb-2 mx-6">Compound Interest Calculator</h2>

        <h3 class="bg-red-300 text-red-900 font-semibold text-xl w-80 rounded-lg my-2 mx-auto">${error}</h3>

        <form action="/" method="post">

            <div class="grid grid-cols-2 gap-4 my-5 mx-8">
                <label for="principleAmount" class="text-xl flex items-center">Principle Amount in USD: $</label>
                <input class="w-full p-1 border-2 placeholder-blue-800 border-blue-700 appearance-none rounded-lg focus:outline-none focus:ring-2" name="principleAmount" id="principleAmount" type="percentage" value="${principleAmount}">

                <label for="interestPercentage" class="text-xl flex items-center">Interest Rate:</label>
                <input class="w-full p-1 border-2 placeholder-blue-800 border-blue-700 appearance-none rounded-lg focus:outline-none focus:ring-2" name="interestPercentage" id="interestPercentage" min="1" max="100" type="percentage" value="${interestPercentage}">

                <label for="years" class="text-xl flex items-center">Number of Years:</label>
                <input class="w-full p-1 border-2 placeholder-blue-800 border-blue-700 appearance-none rounded-lg focus:outline-none focus:ring-2" name="years" id="years" min="1" type="number" value="${years}">

                <label for="compoundingPeriod" class="text-xl flex items-center">Number of Yearly Dividends:</label>
                <input class="w-full p-1 border-2 placeholder-blue-800 border-blue-700 appearance-none rounded-lg focus:outline-none focus:ring-2" name="compoundingPeriod" id="compoundingPeriod" min="1" max="12" type="number" value="${compoundingPeriod}">

            </div>

            <button class="bg-blue-300 text-xl font-semibold px-4 py-1 rounded-lg hover:bg-blue-800 hover:text-white" type="submit">Calculate</button>

            <p class="text-3xl font-mono text-green-600">Total Compound Interest: $${result}</p>

        </form>
    </div>
</div>

</body>
</html>