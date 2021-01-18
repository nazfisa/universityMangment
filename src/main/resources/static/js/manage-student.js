$(document).ready(function() {

    $(".form").on('submit', function(e) {
        e.preventDefault();
        var data = JSON.stringify($(this).serializeObject());
        var url = '/students/save';

        $.ajax({
            data: data,
            url: url,
            method: 'POST',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            success: function(resp) {
                console.log(resp);
                 var row = `<tr><td>${resp.id}</td><td>${resp.name}</td></tr>`;
                $(".table-body").append(row);
                $("input").val("");
            },
            error: function(err) {
                console.log(err);
            }
        });
    });

    $.fn.serializeObject = function() {
        var o = {};
        var a = this.serializeArray();
        $.each(a, function() {
            if (o[this.name] !== undefined) {
                if (!o[this.name].push) {
                    o[this.name] = [o[this.name]];
                }
                o[this.name].push(this.value || '');
            } else {
                o[this.name] = this.value || '';
            }
        });
        return o;
    };
});
