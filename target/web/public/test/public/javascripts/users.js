/**
 * Created by beace on 16/10/14.
 */

window.onload = function () {
    const USER_LIST_URL = "/api/users";
    var tbody = document.querySelector("tbody");
    request(USER_LIST_URL, 'GET');

    function request(url, method) {
        var xhr = new XMLHttpRequest();
        var responseJSON;
        xhr.onreadystatechange = function () {
            if (xhr.readyState == 4) {
                if (xhr.status == 200) {
                    responseJSON = JSON.parse(xhr.responseText);
                    console.log(responseJSON);
                    for (var i = 0, l = responseJSON.length; i < l; i++) {
                        var tr = document.createElement("tr");
                        var html = "<td>" + responseJSON[i].id + "</td>";
                        html += "<td>" + responseJSON[i].username + "</td>";
                        html += "<td>" + responseJSON[i].description + "</td>";
                        html += "<td>" + responseJSON[i].password + "</td>";
                        html += "<td><a href='/users/detail/" + responseJSON[i].id + "'>详情</a> <span style='margin: 0 10px;'>|</span> <a href='/users/" + responseJSON[i].id + "'>修改</a> <span style='margin: 0 10px;'>|</span> <a href='javascript:;' data-id="+responseJSON[i].id+" class='delete'>删除</a></td>";
                        tr.innerHTML = html;
                        tbody.appendChild(tr);
                    }
                } else {
                    alert('There was a problem with the request.');
                }
            }
        };
        switch (method) {
            case 'GET':
                xhr.open(method, url, true);
                break;
            case 'POST':
                xhr.open(method, url, true);
                break;
            case 'DELETE':
                xhr.open(method, url, true);
                break;
        }
        xhr.send(null);
    }
};
